package com.bnta.carsales.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "Dealership")
public class Dealership {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private String name;
    // one dealership has many cars for sale
    //mappedBy tell us what it should be looking for
    @OneToMany(mappedBy = "car")
    private List<Car> cars;

    public Dealership(String name) {
        this.id = id;
        this.name = name;
        this.cars = new ArrayList<Car>();
    }

    public Dealership(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
