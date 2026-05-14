package com.semicore.ecom.prd.svc.controllers;

import com.semicore.ecom.prd.svc.modals.Product;
import com.semicore.ecom.prd.svc.modals.ProductsDb;
import com.semicore.ecom.prd.svc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products") // Base path for all endpoints in this controller
public class ProductController {

    // This class is annotated with @RestController, which indicates that it is a Spring MVC controller
    // that handles HTTP requests and returns responses in a RESTful manner. It is responsible for defining endpoints for managing products, such as retrieving product information, adding new products, modifying existing products, and deleting products.
    // It is a basic implementation of a RESTful API for product management in an e-commerce application with CRUD operations.

    @Autowired // This annotation is used to inject the ProductService dependency into the ProductController.
    // It allows Spring to manage the lifecycle of the ProductService
    // and provide an instance of it when needed.
    ProductService productService;

    //@RequestMapping(path = "/products", method = RequestMethod.GET, produces = "application/json")
    //@RequestMapping(path = "/all", method = RequestMethod.GET, produces = "application/json")
    @GetMapping("/all")
    public List<Product> getProducts() {

        /*// For demonstration, returning a static list of products
        return List.of(
                new Product("1001", "Watch", "Smart watch", 1999.99),
                new Product("1002", "Mobile", "Smart Phone", 2999.99),
                new Product("1003", "Laptop", "Laptop to work", 39999.99)
        );*/
        return productService.getProducts();
    }

    //@RequestMapping(path = "/products/{productid}", method = RequestMethod.GET, produces = "application/json")
    // @RequestMapping(path = "/{productid}", method = RequestMethod.GET, produces = "application/json")
    @GetMapping("/{productid}")
    public Product findProductById(@PathVariable(name = "productid") String id) {
        // Implementation to get a product by ID
   /*     for(Product product : products) {
            if(product.getId().equals(id)) {
                return product;
            }
        }
        return new Product("", "", "No product available", 0.0); // or throw an exception if not found
   */

        return productService.findProductById(id);
    }

    //@RequestMapping(path = "/products/add", method = RequestMethod.POST, consumes = "application/json")
    //@RequestMapping(path = "/add", method = RequestMethod.POST, consumes = "application/json")
    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        // Implementation to add a new product
         String resultFromService = productService.addProduct(product);
         return  resultFromService;
    }

    //@RequestMapping(path = "/products/modify", method = RequestMethod.PUT, consumes = "application/json")
    //@RequestMapping(path = "/modify", method = RequestMethod.PUT, consumes = "application/json")
    @PutMapping("/modify")
    public String modifyProduct(@RequestBody Product product) {
        // Implementation to modify an existing product
           return productService.modifyProduct(product);
    }

    //@RequestMapping(path = "/products/delete/{id}", method = RequestMethod.DELETE)
    //@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable String id) {
        // Implementation to delete a product by ID
        return productService.deleteProduct(id);
    }

}
