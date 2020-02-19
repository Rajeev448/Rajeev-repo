package com.webcore.app.loan.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class PersonalLoanFinanceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalLoanFinanceClientApplication.class, args);
	}

}
