package com.company.akotsenko;

abstract public class Car {
    int speed;
    abstract void Run();
    void Stop() {
        speed = 0;
    }
}

class Ferrari extends Car {

    @Override
    void Run() {
        speed = 25;
    }
}

final class Test{

    int a = 10;
}

//class SampleText extends Test {} // error because the father class is final

class Simple {
    final int a = 10;

    final void getSmt(){
        System.out.println("I am final");
    }

    void printHi() {
        System.out.println("Hi");
    }
}

class FirstSimple extends Simple {

    @Override
    void printHi() {
        System.out.println("Hello");
    }

//    @Override
//    void getSmt(){                          // error because method is final in father class
//        System.out.println("I am final");
//    }


}