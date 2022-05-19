package com.bnta.carsales.repositories;

import com.bnta.carsales.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// jpa could create a save method
public interface CarRepository extends JpaRepository<Car, Long> {

    // return all cars with type Petrol
    //
    List<Car> findCarByType (String type);
}

