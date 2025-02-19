package com.manish.simpleWebApp.service;

import com.manish.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products=new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",50000),
            new Product(102,"Canon Camera",60500),
            new Product(103,"Gaming Controller",4000)
    ));

    // to get all the products
    public List<Product> getProducts(){
        return products;
    }

    //to get the product by Id
    public Product getProductBuId(int prodId) {
        return products.stream().filter(p-> p.getProdId()==prodId)
                .findFirst().orElse(new Product(0,"No item",0));
    }

    //to add products ->postrequest
    public void addProducts(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int idx=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()== prod.getProdId()){
                idx=i; break;
            }
        }
        products.set(idx,prod);
    }
}
