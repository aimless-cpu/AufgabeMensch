package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public void run() {
        Scanner sc = new Scanner(System.in);

        List<Human> humanList = new ArrayList<>();

        Programmer p = new Programmer("test",20, 20, 10);

        p.sleep();
        p.type();

        Athlete a = new Athlete("athlete", 20, false);

        a.getSuccesRate();
        a.doSport();

        FootballPlayer f = new FootballPlayer("football", 23, false);

        f.doSport();





    }
}
