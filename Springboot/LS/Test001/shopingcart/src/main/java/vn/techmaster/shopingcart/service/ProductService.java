package vn.techmaster.shopingcart.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import vn.techmaster.shopingcart.model.Product;
import vn.techmaster.shopingcart.model.ProductRequest;

@Service
public class ProductService {
    public Product saveProduct (ProductRequest request) {
        Product newProd = new Product();

        newProd.setName(request.getName());
        newProd.setManufacturer(request.getManufacturer());
        newProd.setPrice(request.getPrice());
        try {
            newProd.setPhoto(request.getPhoto().getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return newProd;

    }
}
