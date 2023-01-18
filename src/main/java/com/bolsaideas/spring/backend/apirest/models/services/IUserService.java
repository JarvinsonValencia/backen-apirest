package com.bolsaideas.spring.backend.apirest.models.services;

import com.bolsaideas.spring.backend.apirest.models.entity.User;

public interface IUserService {
	
	public User findByUsername(String username);
	
}
