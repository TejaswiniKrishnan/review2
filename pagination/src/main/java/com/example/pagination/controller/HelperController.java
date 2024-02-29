package com.example.pagination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pagination.model.Helper;
import com.example.pagination.service.HelperService;

@RestController
@RequestMapping("/api/helpers")
public class HelperController {
    @Autowired
    private HelperService hs;

    @GetMapping
    public ResponseEntity<Page<Helper>> getAllHelpers(@RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "5") int pageSize,
            @RequestParam(defaultValue = "title") String sortBy) {
        Page<Helper> helpers = hs.getAllHelpers(pageNo, pageSize, sortBy);
        return ResponseEntity.ok(helpers);

    }
}
