package com.example.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.onetomany.model.Products;
import com.example.onetomany.repository.ProductsRepo;

public class ProductsService {
    @Autowired
    private ProductsRepo cr;

    public Products insert(Products c) {
        return cr.save(c);
    }
}
