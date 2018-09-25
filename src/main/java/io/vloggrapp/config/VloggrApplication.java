package io.vloggrapp.config;

import io.vloggrapp.dao.IdeaDAO;
import io.vloggrapp.dao.impl.IdeaDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VloggrApplication {

	public static void main(String[] args) {
		SpringApplication.run(VloggrApplication.class, args);
	}
}
