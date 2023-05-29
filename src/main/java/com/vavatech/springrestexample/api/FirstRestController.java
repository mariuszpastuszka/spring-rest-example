package com.vavatech.springrestexample.api;

import com.vavatech.springrestexample.dto.Person;
import com.vavatech.springrestexample.service.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class FirstRestController {

//    private static final Logger log = LoggerFactory.getLogger(FirstRestController.class);
    private final MyService service;

    public FirstRestController(MyService service) {
        this.service = service;
        log.info("FirstRestController created");
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "welcome to rest";
    }

    @GetMapping("/show-me")
    public Person me() {
        return new Person("mariusz", "p.");
    }
}
