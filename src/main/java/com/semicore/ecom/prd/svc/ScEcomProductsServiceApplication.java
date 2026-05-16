package com.semicore.ecom.prd.svc;

import com.semicore.ecom.prd.svc.controllers.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* @SpringBootApplication is a convenience annotation that combines
* @Configuration, @EnableAutoConfiguration, and @ComponentScan annotations
* with their default attributes. It is used to mark the main class of
* a Spring Boot application and enables auto-configuration, component scanning,
* and configuration properties support.
* */
@SpringBootApplication
public class ScEcomProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEcomProductsServiceApplication.class, args);
		/*ProductController pc = new ProductController();
		System.out.println("Products: " + pc.getProducts())*/;
	}

}
