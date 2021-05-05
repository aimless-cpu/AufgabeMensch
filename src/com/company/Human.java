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
        return;
    }

    public void sleep() {
        //int sleepTime = this.age ;
        System.out.println(" is sleeping");
        return;
    }

    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
