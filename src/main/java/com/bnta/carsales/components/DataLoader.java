package com.bnta.carsales.components;

import com.bnta.carsales.models.Car;
import com.bnta.carsales.models.Dealership;
import com.bnta.carsales.repositories.CarRepository;
import com.bnta.carsales.repositories.DealershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CarRepository carRepository;

    @Autowired
    DealershipRepository dealershipRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Dealership dealership1 = new Dealership("BMW");
        dealershipRepository.save(dealership1);

        Car car1 = new Car("M140i", "Petrol", 20000, dealership1);
        carRepository.save(car1);

        Car car2 = new Car("X5", "Diesel", 30000, dealership1);
        carRepository.save(car2);

        Dealership dealership2 = new Dealership("Volkswagen");
        dealershipRepository.save(dealership2);

        Car car3 = new Car("GTI", "Petrol", 10000, dealership2);
        carRepository.save(car2);

        Car car4 = new Car("R", "Petrol", 35000, dealership2);
        carRepository.save(car3);





    }
}
