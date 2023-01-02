package com.jrferry.javaangularsandbox;

import com.jrferry.javaangularsandbox.entities.AppUser;
import com.jrferry.javaangularsandbox.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.stream.Stream;

@SpringBootApplication
public class JavaAngularSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAngularSandboxApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			Stream.of("James", "John","Jennifer", "Helen").forEach(name -> {
				AppUser user = new AppUser(name, name.toLowerCase() + "@domain.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}

}
