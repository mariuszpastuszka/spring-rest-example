package com.vavatech.springrestexample.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@Slf4j
class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> allCars() {
        log.info("all cars");
        return List.of();
    }

//    @GetMapping
//    public ResponseEntity<List<Car>> allCars() {
//        log.info("all cars");
//
//        return ResponseEntity.ok(List.of());
//    }

    // /api/cars/1
    // /api/cars/13456
    @GetMapping("/{carId}")
    public Car carById(@PathVariable("carId") Long id) {
        log.info("car by id: [{}]", id);

        return carService.findCarById(id);
    }
}
