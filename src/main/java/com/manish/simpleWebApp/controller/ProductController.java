package com.manish.simpleWebApp.controller;

import com.manish.simpleWebApp.model.Product;
import com.manish.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductBuId(prodId);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product prod){
        try {
            service.addProducts(prod);
            return "Product added successfully!!";
        }catch (Exception e){
//            System.out.println(e.toString());
            return "Something went wrong while adding the product!";
        }
    }

//    @PutMapping("/updateproduct") // we can use any name just make sure other request of same type doesn't have the same name
    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod){
        try {
            service.updateProduct(prod);
            return "Product updated Succefully!!";
        }catch (Exception e){
            return e.toString();
        }
    }

}
