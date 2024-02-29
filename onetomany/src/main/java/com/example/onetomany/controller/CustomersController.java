package com.example.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.model.Customers;
import com.example.onetomany.service.CustomersService;

@RestController
public class CustomersController {
    @Autowired
    private CustomersService repo;

    @PostMapping("/customers")
    public ResponseEntity<Customers> insert(@RequestBody Customers cus) {
        Customers cp = repo.insert(cus);
        return new ResponseEntity<>(cp, HttpStatus.CREATED);
    }

    @GetMapping("/customer")
    public ResponseEntity<List<Customers>> getAllHome() {
        List<Customers> cs = repo.getAllHome();
        return new ResponseEntity<>(cs, HttpStatus.OK);
    }

}
