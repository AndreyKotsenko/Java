package com.company.akotsenko;

public class Main {

    public static void main(String[] args) {
        Toyota a = new Toyota();

        Car b = new Toyota();

        System.out.println(a.getAge());
        System.out.println(a.getSpeed());
        //System.out.println(a.getSubject()); error Because we can't access private fields and methods even with inheritance

        System.out.println(b.getSpeed());
        //System.out.println(b.getAge()); error 'cause class Car don't have method getSpeed
    }
}
