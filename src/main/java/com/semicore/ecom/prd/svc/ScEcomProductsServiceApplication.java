package com.semicore.ecom.prd.svc;

import com.semicore.ecom.prd.svc.controllers.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScEcomProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScEcomProductsServiceApplication.class, args);
		/*ProductController pc = new ProductController();
		System.out.println("Products: " + pc.getProducts())*/;
	}

}
