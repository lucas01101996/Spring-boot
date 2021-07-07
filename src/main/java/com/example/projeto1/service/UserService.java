package com.example.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto1.entity.User;
import com.example.projeto1.repository.UserRepository;

@Service // camada de regra de negocio
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
