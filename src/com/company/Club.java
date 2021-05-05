package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Club {
    Scanner sc = new Scanner(System.in);
    //instance
    private String name;
    private List<Club> memberListClub = new ArrayList<>();

    //constructor
    public Club(String name) {
        this.name = name;
    }

    //method
    public void addMemberToClub(int n) {
        if (n == 1) {
            System.out.println("name?");
            String name = sc.next();
            System.out.println("age?");
            int age = sc.nextInt();
            System.out.println("injured?");
            boolean injured = sc.nextBoolean();
            System.out.println("runningSpeed?");
            int runningSpeed = sc.nextInt();
            System.out.println("runningSpeedWithBall");
            int runningSpeedWithBall = sc.nextInt();
            Striker striker = new Striker(name, age, injured, runningSpeed, runningSpeedWithBall);
            memberListClub.add(striker);

        } else if (n == 2) {
            System.out.println("name?");
            String name = sc.next();
            System.out.println("age?");
            int age = sc.nextInt();
            System.out.println("injured?");
            boolean injured = sc.nextBoolean();

            memberListClub.add(keeper);

        } else {
            System.out.println("name?");
            String name = sc.next();
            System.out.println("age?");
            int age = sc.nextInt();
            System.out.println("injured?");
            boolean injured = sc.nextBoolean();
            FootballPlayer footballPlayer = new FootballPlayer();

        }



    }
}
