package com.bnta.carsales;

import com.bnta.carsales.models.Car;
import com.bnta.carsales.repositories.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CarsalesApplicationTests {

	@Autowired
	CarRepository carRepository;
	@Test
	void contextLoads() {
	}


	@Test
	public void canFindPetrolInCar(){
		List<Car> found = carRepository.findCarByType("petrol");
		assertThat(found.size()).isEqualTo(1);


	}

}
