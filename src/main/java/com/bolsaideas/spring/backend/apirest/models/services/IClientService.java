package com.bolsaideas.spring.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsaideas.spring.backend.apirest.models.entity.Client;
import com.bolsaideas.spring.backend.apirest.models.entity.Factura;
import com.bolsaideas.spring.backend.apirest.models.entity.Product;
import com.bolsaideas.spring.backend.apirest.models.entity.Region;

public interface IClientService {
	
	 public List<Client> listUsers();
	 
	 public Page<Client> findAll(Pageable pageable);
	 
	 public Client save(Client client);
	 
	 public Client findById(Long id);
	 
	 public void delete(Long id);
	 
	 public List<Region> findAllRegiones();
	 
	 public Factura findFacturaById(Long id);
	 
	 public Factura saveFactura(Factura factura);
	 
	 public void deleteFacturaById(Long id);
	 
	 public List<Product> findProductByName(String term);
}
