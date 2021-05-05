package com.company;

public class Striker extends FootballPlayer{
    //instance
    private int runningSpeed;
    private int runningSpeedWithBall;

    //constructor
    public Striker(String name, int age, boolean injured, int runningSpeed, int runningSpeedWithBall) {
        super(name, age, injured);
        this.runningSpeed = runningSpeed;
        this.runningSpeedWithBall = runningSpeedWithBall;
    }

    //method
    public void runFast() {
        System.out.println(getName() + " runs at " + this.runningSpeed + " m/s.");
        return;
    }

    public void doTrick() {
        System.out.println(getName() + " runs while doing tricks at " + this.runningSpeedWithBall + " m/s.");
    }

}
