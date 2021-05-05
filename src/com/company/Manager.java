package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

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

        FootballPlayer f = new FootballPlayer("football player", 23, false);
        f.doSport();
        f.getRidiculousHairStyleLevelString();

        Striker s = new Striker("striker",22,false,10,5);
        s.doTrick();
        s.runFast();



        Club liverpool = new Club("Liverpool");
        int n = 1;
        liverpool.addMemberToClub(n);
        n = 2;
        liverpool.addMemberToClub(n);


        System.out.println(liverpool.getMemberListClub());



















    }
}
