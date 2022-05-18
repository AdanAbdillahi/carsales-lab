package com.bnta.carsales.repositories;

import com.bnta.carsales.models.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealershipRepository extends JpaRepository<Dealership, Long> {
}
