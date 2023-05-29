package com.vavatech.springrestexample.service;

import com.vavatech.springrestexample.repository.MyRepo;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyRepo repository;

    public MyService(MyRepo repository) {
        this.repository = repository;
    }
}
