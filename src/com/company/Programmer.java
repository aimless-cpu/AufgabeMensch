package com.company;

public class Programmer extends Human {
    //instance
    private double typeSpeed;
    private double drinkSpeed;

    //constructor
    public Programmer(String name, int age, double typeSpeed, double drinkSpeed) {
        super(name, age);
        this.typeSpeed = typeSpeed;
        this.drinkSpeed = drinkSpeed;
    }
}
