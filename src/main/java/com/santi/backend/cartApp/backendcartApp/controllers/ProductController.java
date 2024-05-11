package com.santi.backend.cartApp.backendcartApp.controllers;

import com.santi.backend.cartApp.backendcartApp.models.entities.Product;
import com.santi.backend.cartApp.backendcartApp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public List<Product> findAll() {
        return service.findAll();
    }
}
