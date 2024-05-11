package com.santi.backend.cartApp.backendcartApp.repositories;

import com.santi.backend.cartApp.backendcartApp.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
