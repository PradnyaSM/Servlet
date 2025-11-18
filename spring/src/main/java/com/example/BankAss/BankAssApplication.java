package com.example.BankAss;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BankAssApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankAssApplication.class, args);
	}
		@Bean
		public CommandLineRunner printBeans(ApplicationContext context) {
			return args -> {
				System.out.println("===== List of Spring Boot Beans =====");

				String[] beanNames = context.getBeanDefinitionNames();
				for (String name : beanNames) {
					System.out.println(name);
				}
			};


		}
}
