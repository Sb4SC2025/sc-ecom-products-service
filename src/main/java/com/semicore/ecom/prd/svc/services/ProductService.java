package com.semicore.ecom.prd.svc.services;

import com.semicore.ecom.prd.svc.modals.Product;
import com.semicore.ecom.prd.svc.modals.ProductsDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

        @Autowired
        private ProductsDb productsDb;
        /* This class can be used to implement business logic related to products, such as fetching products from a database,
            applying discounts, or handling product-related operations. For now, it can be left empty or contain placeholder methods. */
        public Product findProductById(String id) {
            // Implementation to get a product by ID
            for(Product product : productsDb.getProducts()) {
                if(product.getId().equals(id)) {
                    return product;
                }
            }
            return new Product("", "", "No product available", 0.0); // or throw an exception if not found
        }

    public List<Product> getProducts() {
        return productsDb.getProducts();
    }

    public String addProduct(Product product) {
        productsDb.getProducts().add(product);
        return "Product added successfully";
    }

    public String modifyProduct(Product product) {
        List<Product> products = productsDb.getProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(product.getId())) {
                products.set(i, product);
                return "Product modified successfully";
            }
        }
        return "Product not found";
    }

    public String deleteProduct(String id) {
        List<Product> products = productsDb.getProducts();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
                return "Product deleted successfully";
            }
        }
        return "Product not found";
    }

    public Product findProductByName(String name) {
        // Implementation to get a product by name
        for(Product product : productsDb.getProducts()) {
            if(product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return new Product("", "", "No product available", 0.0); // or throw an exception if not found
    }

    public Product findProductByIdAndName(String id, String name) {
        // Implementation to get a product by ID and name
        for(Product product : productsDb.getProducts()) {
            if(product.getId().equals(id) && product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return new Product("", "", "No product available", 0.0); // or throw an exception if not found
    }
}
