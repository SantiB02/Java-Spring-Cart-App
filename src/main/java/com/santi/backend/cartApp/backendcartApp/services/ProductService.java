package com.santi.backend.cartApp.backendcartApp.services;

import com.santi.backend.cartApp.backendcartApp.models.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
