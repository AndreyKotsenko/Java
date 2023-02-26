package com.company.akotsenko;

public class Overload {

    int addTwoDigits(int a, int b){
        return a + b;
    }

    double addTwoDigits(double a, double b){
        return a + b;
    }

    String addTwoDigits(double a, double b, String hi){
        return hi + " " + (a + b);
    }
}


