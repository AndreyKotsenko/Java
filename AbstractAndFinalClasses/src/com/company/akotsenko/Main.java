package com.company.akotsenko;

public class Main {

    public static void main(String[] args) {
        //Car car = new Car(); we can't do this because this class is abstract

        Car test = new Ferrari(); // we can do this because Ferrari is not abstract

        test.Run();
        System.out.println(test.speed);
        test.Stop();
        System.out.println(test.speed);
    }
}
