package com.bnta.carsales.components;

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

    }
}
