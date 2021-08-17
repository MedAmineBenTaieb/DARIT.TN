package tn.dari.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tn.dari.spring.domain.AppUser;
import tn.dari.spring.domain.Role;
import tn.dari.spring.service.interfaces.TestService;

@Configuration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
