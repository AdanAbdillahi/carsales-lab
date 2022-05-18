package com.bnta.carsales.models;

import javax.persistence.*;

// lets hibernate know we want to map the database table
@Entity
@Table (name = "cars")
public class Car {

    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private int price;

    //pinnedforlater - coloum should be here
    // Many 'Cars' have 1 dealership in which you purchase the car
    // describes the relationship for Hibernate
    // nullable false - an error would occur
    // joincolumn vet foreign
    // think about in each class what is the relationship between the classes to determine the relationship
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Dealership dealership;

    public Car(String name, String type, int price, Dealership dealership) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.dealership = dealership;
    }
// default constructor
    public Car() {}

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }
}

