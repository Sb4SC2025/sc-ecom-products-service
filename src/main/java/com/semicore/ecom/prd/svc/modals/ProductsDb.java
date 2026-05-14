package com.semicore.ecom.prd.svc.modals;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ProductsDb {
    ArrayList<Product> products;

    public ProductsDb() {
        products = new ArrayList<>();
        products.add(new Product("1001", "Watch", "Smart watch", 1999.99));
        products.add(new Product("1002", "Mobile", "Smart Phone", 2999.99));
        products.add(new Product("1003", "Laptop", "Laptop to work", 39999.99));
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
