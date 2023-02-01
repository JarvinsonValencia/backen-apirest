package com.bolsaideas.spring.backend.apirest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsaideas.spring.backend.apirest.models.entity.Factura;

public interface IFacturaDao extends JpaRepository<Factura, Long> {

}
