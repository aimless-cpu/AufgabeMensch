package com.company;

public class Keeper extends FootballPlayer {
    //instance
    private int reactionTime;
    private int jumpDistance;

    //constructor

    public Keeper(String name, int age, boolean injured, int reactionTime, int jumpDistance) {
        super(name, age, injured);
        this.reactionTime = reactionTime;
        this.jumpDistance = jumpDistance;
    }

    //method
    public void keep() {
        System.out.println(getName() + " is keeping the goal clean.");
    }

    public void jump() {
        System.out.println(getName() + " jumps " + this.jumpDistance + "m with a reaction time of " + this.reactionTime);
    }


}
