package com.bolsaideas.spring.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsaideas.spring.backend.apirest.model.dao.IClientDao;
import com.bolsaideas.spring.backend.apirest.model.dao.IFacturaDao;
import com.bolsaideas.spring.backend.apirest.model.dao.IProductoDao;
import com.bolsaideas.spring.backend.apirest.models.entity.Client;
import com.bolsaideas.spring.backend.apirest.models.entity.Factura;
import com.bolsaideas.spring.backend.apirest.models.entity.Product;
import com.bolsaideas.spring.backend.apirest.models.entity.Region;

@Service
public class ClientServiceImpl implements IClientService{

	@Autowired
	private IClientDao clientDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;

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

	@Override
	@Transactional(readOnly = true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
	}

	@Override
	public List<Product> findProductByName(String term) {
		return productoDao.findByNameContainingIgnoreCase(term);
	}
	

	
}
