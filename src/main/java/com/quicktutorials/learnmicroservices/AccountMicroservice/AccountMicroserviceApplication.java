package com.quicktutorials.learnmicroservices.AccountMicroservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountMicroserviceApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(AccountMicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception  {
		log.info("Hello closhards e benvenuti...");

	}


	}
