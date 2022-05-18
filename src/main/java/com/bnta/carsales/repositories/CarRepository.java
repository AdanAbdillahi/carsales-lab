package com.bnta.carsales.repositories;

import com.bnta.carsales.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

// jpa could create a save method
public interface CarRepository extends JpaRepository<Car, Long> {
}
