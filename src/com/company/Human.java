package com.company;

public class Human {
    //instance
    private String name;
    private int age;

    //constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        //int sleepTime = this.age ;
        System.out.println(" is sleeping");

    }
}
