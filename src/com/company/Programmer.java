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

    //method
    public void type() {
        System.out.println("typing " + this.typeSpeed + " characters per second." );
        return;
    }

    public void drinkSpeed() {
        System.out.println("drinks 1 Cup of coffee in " + this.drinkSpeed + " seconds.");
        return;
    }

    public void sleep() {
        System.out.println("sleep is redundant.");
        return;
    }
}
