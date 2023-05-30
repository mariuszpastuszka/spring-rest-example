package com.vavatech.springrestexample.api;

import com.vavatech.springrestexample.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CarControllerAdvisor {

//    @ExceptionHandler(CarNotFoundException.class)
    @ExceptionHandler
            (value = {CarNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleCarNotFound(CarNotFoundException exc) {
        return exc.getMessage();
    }
}
