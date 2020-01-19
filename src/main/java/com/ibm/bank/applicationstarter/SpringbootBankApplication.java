package com.ibm.bank.applicationstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.ibm.bank"})
@EnableJpaRepositories("com.ibm.bank")
@EntityScan("com.ibm.bank.model.persistence.account")
public class SpringbootBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBankApplication.class, args);
		System.out.println("Bank Application Start Running");
	}

}
