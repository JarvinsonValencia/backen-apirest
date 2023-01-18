package com.bolsaideas.spring.backend.apirest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bolsaideas.spring.backend.apirest.models.entity.User;

public interface IUserDao extends JpaRepository<User, Long>{
	
	public User findByUsername(String username);
	
//	@Query("select u from User u where u.username=?1")
//	public User findByUsername2(String username);
}
