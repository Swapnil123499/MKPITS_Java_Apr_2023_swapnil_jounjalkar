package com.Medicare.entity.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Medicare.entity.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
