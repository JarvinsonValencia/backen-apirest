package com.bolsaideas.spring.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsaideas.spring.backend.apirest.model.dao.IClientDao;
import com.bolsaideas.spring.backend.apirest.models.entity.Client;
import com.bolsaideas.spring.backend.apirest.models.entity.Region;

@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientDao clientDao;

	@Override
	public List<Client> listUsers() {
		
		return clientDao.findAll();
	}

	@Override
	@Transactional
	public Client save(Client client) {
		return clientDao.save(client);
	}

	@Override
	@Transactional(readOnly = true)
	public Client findById(Long id) {
		return clientDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		clientDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Client> findAll(Pageable pageable) {
		return clientDao.findAll(pageable);
	}

	@Override
	public List<Region> findAllRegiones() {
		return clientDao.findAllRegiones();
	}
	

	
}
