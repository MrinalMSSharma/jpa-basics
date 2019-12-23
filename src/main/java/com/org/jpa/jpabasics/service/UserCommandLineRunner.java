package com.org.jpa.jpabasics.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.jpa.jpabasics.entity.User;
import com.org.jpa.jpabasics.repository.UserRepository;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(UserCommandLineRunner.class);
	
	@Autowired
	private UserRepository service;
	
	/*
	 * @Autowired private UserDaoService service;
	 */

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Jill", "Admin");
		User insertUser = service.save(user);
		logger.info("Inserted user is: " + insertUser);
		
		Optional<User> id = service.findById(1);
		
		List<User> list = service.findAll();
		logger.info("All users are: " + list);
		
		/* service.insert(user); */
		
		logger.info("New user inserted is: " + user + "with id " + id);
	}
}