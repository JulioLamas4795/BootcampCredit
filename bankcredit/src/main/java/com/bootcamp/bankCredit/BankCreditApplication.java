package com.bootcamp.bankCredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import static com.bootcamp.bankCredit.utils.Constants.API_CLIENT_URL;


@EnableEurekaClient
@SpringBootApplication
public class BankCreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankCreditApplication.class, args);
	}

}
