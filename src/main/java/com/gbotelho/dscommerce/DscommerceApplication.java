package com.gbotelho.dscommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "com.gbotelho.entities")
@SpringBootApplication
public class DscommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
	}

}
