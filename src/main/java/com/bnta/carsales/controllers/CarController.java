package com.bnta.carsales.controllers;

import com.bnta.carsales.models.Car;
import com.bnta.carsales.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("cars") // localhost:8080/cars
public class CarController {

    @Autowired
    CarRepository carRepository;

//INDEX GET/pets
    // returns all the pets
 @GetMapping
      public ResponseEntity<List<Car>>getAllCarsandFilters(
              @RequestParam(required = false, name = "type") String type
 ){
 if(type != null){
     return new ResponseEntity<>(carRepository.findCarByType(type), HttpStatus.OK);
 }
     return new ResponseEntity<>(carRepository.findAll(), HttpStatus.OK);
 }

  @GetMapping // localhost:8080/cars?type=petrol
    public ResponseEntity<List<Car>> getAllCarsOfType(
            @RequestParam(name="type") String type) {
        return new ResponseEntity<>(carRepository.findCarByType(type), HttpStatus.OK);
    }
    //SHOW - we want to show one specific pet

    @GetMapping( "/{id}" ) // localhost:8008/cars/
    public ResponseEntity<Optional<Car>> getCar(@PathVariable Long id){
        return new ResponseEntity<>(carRepository.findById(id),HttpStatus.OK);
    }

    //POST -
    @PostMapping //POST localhost:8080/cars - when filling in data, controllers hears and grabs body
    public ResponseEntity<Car> createCar(@RequestBody Car newCar){
        carRepository.save(newCar);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);

    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteCar (@PathVariable("id") Long id) {
        carRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
