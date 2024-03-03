package com.example.day09.dao;

import com.example.day09.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProduct();
    Product getProductById(String id);
    boolean insertProduct(Product product);
    boolean updateProduct(Product product);
    boolean DeleteProduct(String id);
}