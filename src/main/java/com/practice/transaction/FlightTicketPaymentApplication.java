package com.practice.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class FlightTicketPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightTicketPaymentApplication.class, args);
	}

}
