package com.nareshit.bank.HDFCBankApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class HdfcBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcBankApplication.class, args);
	}

}
