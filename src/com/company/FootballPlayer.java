package com.company;

import java.util.Random;

public class FootballPlayer extends Athlete{
    //instance
    private int ridiculousHairStyleLevel;
    private double money;

    //constructor
    public FootballPlayer(String name, int age, boolean injured) {
        super(name, age, injured);
    }

    //method
    public void doSport() {
        Random rand = new Random();
        this.money = 1000 + rand.nextInt(99999);
        System.out.println(getName() + " does sport and gets " + this.money + " worth of money.");
        return;
    }


    //getter setter

    public int getRidiculousHairStyleLevel() {
        return ridiculousHairStyleLevel;
    }

    public void setRidiculousHairStyleLevel(int ridiculousHairStyleLevel) {
        this.ridiculousHairStyleLevel = ridiculousHairStyleLevel;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
