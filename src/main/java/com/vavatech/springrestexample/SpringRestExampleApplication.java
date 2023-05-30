package com.vavatech.springrestexample;

import com.vavatech.springrestexample.repository.AnotherRepo;
import com.vavatech.springrestexample.service.AnotherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRestExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestExampleApplication.class, args);
    }

    @Bean
    public AnotherService someService() {
        return new AnotherService(repo());
    }

    @Bean
    public AnotherRepo repo() {
        return new AnotherRepo();
    }
}
