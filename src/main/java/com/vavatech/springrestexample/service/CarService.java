package com.vavatech.springrestexample.service;

import com.vavatech.springrestexample.entity.Car;
import com.vavatech.springrestexample.exception.CarNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.YearMonth;

@Service
@Slf4j
public class CarService {
    public Car findCarById(Long id) {
        if (id == 1L) {
            return  Car.builder()
                    .id(id)
                    .brand("Mazda")
                    .model("VI")
                    .yearMonthProduction(YearMonth.of(2000, 1))
                    .mileage(200_000)
                    .build();
        }
        throw new CarNotFoundException("No car with id: " + id);
    }
}
