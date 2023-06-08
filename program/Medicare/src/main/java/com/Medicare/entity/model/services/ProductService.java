package com.Medicare.entity.model.services;

import java.util.Set;

import com.Medicare.entity.model.Product;

public interface ProductService {
public Product createproduct(Product product);
public Product updateproduct(Product product);
public Product getproductbyid(Long productid);
public Set<Product> getallproduct();
public void deleteproductbyid(Long productid);
}
