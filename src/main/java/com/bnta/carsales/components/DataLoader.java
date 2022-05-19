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

        Dealership dealership1 = new Dealership("bmw");
        dealershipRepository.save(dealership1);

        Car car1 = new Car("m140i", "petrol", 20000, dealership1);
        carRepository.save(car1);

        Car car2 = new Car("x4", "diesel", 30000, dealership1);
        carRepository.save(car2);

        Car car3 = new Car("i8", "electric", 50000, dealership1);
        carRepository.save(car3);


        //--//

        Dealership dealership2 = new Dealership("volkswagen");
        dealershipRepository.save(dealership2);

        Car car4 = new Car("gti", "petrol", 10000, dealership2);
        carRepository.save(car4);

        Car car5 = new Car("r", "petrol", 35000, dealership2);
        carRepository.save(car5);

        Car car6 = new Car("id3", "electric", 15000, dealership2);
        carRepository.save(car6);





    }
}
