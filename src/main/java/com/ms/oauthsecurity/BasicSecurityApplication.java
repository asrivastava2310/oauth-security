package com.ms.oauthsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Configuration
public class BasicSecurityApplication {

	@Bean
	public CommandLineRunner seedDatabase(UserRepository userRepository){
		return args -> Stream.of("test,{noop}test","sam,{noop}sam")
				             .map(u->u.split(","))
				             .forEach(t->userRepository.save(new UserAccount(t[0],t[1],true)));
	}

}
