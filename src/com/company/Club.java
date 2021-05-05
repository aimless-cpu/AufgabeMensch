package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Club extends Manager{
    Scanner sc = new Scanner(System.in);
    //instance
    private String name;
    private List<Human> memberListClub = new ArrayList<>();


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
            this.memberListClub.add(striker);

        } else if (n == 2) {
            System.out.println("name?");
            String name = sc.next();
            System.out.println("age?");
            int age = sc.nextInt();
            System.out.println("injured?");
            boolean injured = sc.nextBoolean();
            System.out.println("reactionTime?");
            int reactionTime = sc.nextInt();
            System.out.println("jummpDistance?");
            int jumpDistance = sc.nextInt();
            Keeper keeper = new Keeper(name, age,injured, reactionTime, jumpDistance);
            memberListClub.add(keeper);
        }
    }

    public void addMemberToClubFootballPlayer() {
            System.out.println("name?");
            String name = sc.next();
            System.out.println("age?");
            int age = sc.nextInt();
            System.out.println("injured?");
            boolean injured = sc.nextBoolean();
            FootballPlayer footballPlayer = new FootballPlayer(name, age, injured);
            this.memberListClub.add(footballPlayer);
    }



    //getter setter



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Human> getMemberListClub() {
        return memberListClub;
    }

    public void setMemberListClub(List<Human> memberListClub) {
        this.memberListClub = memberListClub;
    }
}
