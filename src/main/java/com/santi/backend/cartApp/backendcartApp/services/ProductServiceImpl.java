package com.santi.backend.cartApp.backendcartApp.services;

import com.santi.backend.cartApp.backendcartApp.models.entities.Product;
import com.santi.backend.cartApp.backendcartApp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //para configurarlo como componente de Spring (Bean)
public class ProductServiceImpl implements ProductService {

    @Autowired //inyecta la dependencia automáticamente
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true) //transacción: consulta SQL "all in or all out" (si falla algo, se hace un
    // rollback)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll(); //type cast del tipo List<Product> porque sino devuelve Enumerable
    }
}
