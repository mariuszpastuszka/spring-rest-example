package com.vavatech.springrestexample.car;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
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

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
    public List<CarEntity> allCars() {
        log.info("all cars");
        return carService.findAll();
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
    public CarEntity carById(@PathVariable("carId") Long id) {
        log.info("car by id: [{}]", id);

        return carService.findCarById(id);
    }

    @PostMapping
    public ResponseEntity<Car> createCar(@RequestBody @Valid Car toSave,
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
