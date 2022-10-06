package com.example.belajarcrud01.services;

import com.example.belajarcrud01.models.ProductModel;

import java.util.List;

public interface ProductService {
    ProductModel save(ProductModel productModel);
    ProductModel get(Long id);

    void update(ProductModel productModel);
    void delete(Long id);
    List<ProductModel> findAll();

}
