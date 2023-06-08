package com.Medicare.entity.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Medicare.entity.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
