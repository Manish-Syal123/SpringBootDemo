package com.manish.simpleWebApp.service;

import com.manish.simpleWebApp.model.Product;
import com.manish.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products=new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Canon Camera",60500),
//            new Product(103,"Gaming Controller",4000)
//    ));

    // to get all the products
    public List<Product> getProducts(){
        return repo.findAll();
    }

    //to get the product by Id
    public Product getProductBuId(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    //to add products ->postrequest
    public void addProducts(Product prod){
        repo.save(prod);
    }

    //to Update the product by it's id
    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    //to delete a product by it's id
    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }

}
