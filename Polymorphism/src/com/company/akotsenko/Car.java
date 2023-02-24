package com.company.akotsenko;

public class Car {

    int speed = 100;
    int seets = 4;

    int getSpeed(){
        return speed;
    }

    private String getSubject(){
        return "It is car";
    }

    void driving(){
        System.out.println("Run");
    }

    int getNumsOfSeets(){
        return seets;
    }
}
