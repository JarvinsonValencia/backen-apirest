package com.bolsaideas.spring.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;



@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Client implements Serializable {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	@Size(min = 3, message = "El nombre debe tener minímo 3 caracteres")
	@NotBlank(message = "El campo nombre no puede estar vacío")
	private String name;
	
	@NotBlank(message = "El campo apellido no puede estar vacío")
	private String lastname;
	
	@Column( unique = false)
	@NotBlank
	@Email(message = "Error de formato de correo electrónico")
	private String email;
	
	@Temporal(TemporalType.DATE)
	@NotNull(message = "No puede estar vacío")
	private Date createAt;
	
	private String image;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@NotNull(message = "La región no puede estar vacía")
	private Region region;
	


//	@PrePersist
//	public void prePersist() {
//		createAt = new Date();
//	}
	
	
}
