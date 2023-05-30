package com.vavatech.springrestexample.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.List;

@Service
@Slf4j
class CarService {

    private final CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarEntity findCarById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException("No car with id: " + id));

    }

    public List<CarEntity> findAll() {
        return carRepository.findAll();
    }
}
