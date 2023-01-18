package com.bolsaideas.spring.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsaideas.spring.backend.apirest.model.dao.IUserDao;
import com.bolsaideas.spring.backend.apirest.models.entity.User;

@Service
public class UserService implements IUserService, UserDetailsService{
	
	@Autowired
	private IUserDao iUserDao;
	
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = iUserDao.findByUsername(username);
		
		if( user == null) {
			logger.error("Error en el login: no existe el usuario '"+ username + "' en el sistema");
		}
		
		List<GrantedAuthority> authorities = user.getListRoles()
				.stream()
				.map(role -> new SimpleGrantedAuthority(role.getName()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority()))
				.collect(Collectors.toList());
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(), true, true, true, authorities);
	}

	@Override
	public User findByUsername(String username) {
		return iUserDao.findByUsername(username);
	}
}
