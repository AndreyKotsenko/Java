package com.company.akotsenko;

public class StaticExample {
    static  int i = 5;
    int j;

    static {
        i = 6;
        System.out.println("static init");
    }

    {
        System.out.println("init");
    }

    {
        System.out.println("second init");
    }

    StaticExample() {
        System.out.println("Constructor");
    }

    static void staticMethod() {
        System.out.println("static method");
    }

}
