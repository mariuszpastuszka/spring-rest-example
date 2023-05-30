package com.vavatech.springrestexample.service;

import com.vavatech.springrestexample.repository.AnotherRepo;

// with @Bean
public class AnotherService {

    private final AnotherRepo repo;

    public AnotherService(AnotherRepo repo) {
        this.repo = repo;
    }
}
