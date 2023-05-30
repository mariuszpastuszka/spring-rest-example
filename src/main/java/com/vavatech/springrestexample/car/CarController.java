package com.vavatech.springrestexample.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
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

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody Car toSave,
                                         UriComponentsBuilder ucb) {
        log.info("trying to create new car: {}", toSave);

        // send to save
        Long id = 1L;
        URI uri = ucb.path("/api/cars/{id}")
                .buildAndExpand(id).toUri();

//        String.format("ala ma %s", "kota");
        return ResponseEntity.created(uri).body(toSave);
    }
}
