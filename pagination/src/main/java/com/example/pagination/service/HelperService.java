package com.example.pagination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.pagination.model.Helper;
import com.example.pagination.repository.HelperRepo;

@Service
public class HelperService {
    @Autowired
    private HelperRepo hr;

    public Page<Helper> getAllHelpers(int pageNo, int pageSize, String sortBy) {
        PageRequest pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        return hr.findAll(pageable);
    }
}