package com.example.belajarcrud01.repositories;

import com.example.belajarcrud01.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
