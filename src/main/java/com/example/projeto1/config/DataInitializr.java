package com.example.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.projeto1.entity.User;
import com.example.projeto1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		List<User> users = userRepository.findAll();
		
		if(users.isEmpty()) {
			createUser("Lucas", "lucas_sdfasdf@");
			createUser("kamila", "kamila@sdfdsf");
			createUser("liz", "liz@gmail.com");
		}
		
		User user = userRepository.findByNameIgnoreCase("lucas");
		
		System.out.println(user.getName());
		
		
		//User user = userRepository.getOne(1L);
		
		//user.setName("Lucas Ferraz");
		
		//userRepository.save(user);
		
		
		
	}
	
	public void createUser (String name, String email) {
		
		User user = new User(name, email);
		userRepository.save(user);
	}

}
