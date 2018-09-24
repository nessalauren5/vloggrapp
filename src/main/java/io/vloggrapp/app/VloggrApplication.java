package io.vloggrapp.app;

import io.vloggrapp.dao.IdeaDAO;
import io.vloggrapp.dao.impl.IdeaDAOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VloggrApplication {

	@Bean
	protected IdeaDAO ideaDAO(){
		return new IdeaDAOImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(VloggrApplication.class, args);
	}
}
