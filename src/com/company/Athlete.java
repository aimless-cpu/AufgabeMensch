package com.company;

import java.util.Random;

public class Athlete extends Human {
    //instance
    private boolean injured;
    private double sucessRate = 0;

    //constructor
    public Athlete(String name, int age, boolean injured) {
        super(name, age);
        this.injured = injured;
    }

    //method
    public void doSport() {
        System.out.println(getName() + " does sport.");
        return;
    }

    public void getSuccesRate() {
        Random rand = new Random();
        int n = 1 + rand.nextInt(10);
        System.out.println(n);

        if (!this.injured) {
            this.sucessRate = getAge()*n;
        }

        System.out.println("todays succes rate: " + this.sucessRate);

    }

    //getter setter


    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public double getSucessRate() {
        return sucessRate;
    }

    public void setSucessRate(double sucessRate) {
        this.sucessRate = sucessRate;
    }
}
