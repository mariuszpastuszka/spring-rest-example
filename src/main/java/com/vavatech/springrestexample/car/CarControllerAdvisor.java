package com.vavatech.springrestexample.car;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDateTime;

@RestControllerAdvice
class CarControllerAdvisor {

//    @ExceptionHandler(CarNotFoundException.class)
    @ExceptionHandler
            (value = {CarNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessageDto handleCarNotFound(CarNotFoundException exc) {
        String path = ServletUriComponentsBuilder.fromCurrentRequest().build().toUriString();
        return ErrorMessageDto.builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.NOT_FOUND.value())
                .error("entity not found")
                .message(exc.getMessage())
                .path(path)
                .build();
    }
}
