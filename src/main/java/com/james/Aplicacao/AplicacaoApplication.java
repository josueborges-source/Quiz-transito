package com.james.Aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
@SpringBootApplication
public class AplicacaoApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(AplicacaoApplication.class, args);
		
	}

}
