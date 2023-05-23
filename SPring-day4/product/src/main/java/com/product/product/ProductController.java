package com.product.product;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    Product_service service;

    @GetMapping("/getproduct")
    public List<Product> getAllProduct() throws SQLException {
        return service.getAllProduct();
    }

    @GetMapping("/getproduct/{name}")
    public Product getProduct(@PathVariable String name) throws SQLException {
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(Product product) throws SQLException {
        service.addProduct(product);
    }

    @GetMapping("/productByPlace/{name}")
    public List<Product> getProducttByPlace(@PathVariable String name) throws SQLException {
        return service.getProductByPlace(name);
    }

    @GetMapping("/productByWranty")
    public List<Product> getProductByWranty() throws SQLException {
        return service.getProductByWranty();
    }

    @GetMapping("/productByText/{name}")
    public List<Product> getProductWithText(@PathVariable String name) throws SQLException {
        return service.getProductWithText(name);
    }

}
