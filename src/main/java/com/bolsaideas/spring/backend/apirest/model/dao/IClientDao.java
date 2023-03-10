package com.bolsaideas.spring.backend.apirest.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsaideas.spring.backend.apirest.models.entity.Client;
import com.bolsaideas.spring.backend.apirest.models.entity.Region;

@Repository
public interface IClientDao extends JpaRepository<Client, Long> {
	
	@Query("from Region")
	public List<Region> findAllRegiones();
}
