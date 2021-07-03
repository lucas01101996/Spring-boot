package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.name like %?1%")
	User findByNameQualquer(String name); // consulta pelo nome
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);

}
