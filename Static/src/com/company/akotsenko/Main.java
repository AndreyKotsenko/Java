package com.company.akotsenko;

public class Main {
    static Main main = new Main();
    static int n = 4;
    static int i = returnIntStatic();

    static int k = 3;
    int j = returnInt();

    static {
        System.out.println("Static");
    }
    {
        System.out.println("clean");
    }
    Main() {
        System.out.println("construct");
    }

    static int returnIntStatic() {
        System.out.println(n);
        System.out.println(k);
        System.out.println("return static int");
        return 1;
    }

    int returnInt() {
        System.out.println("return int");
        return j;
    }

    public static void main(String[] args) {
        // hard example about Main class
        System.out.println("Hard example");
        new Main();

        System.out.println();

        // another class
        System.out.println("\nAnother:");
        System.out.println(StaticExample.i);
        StaticExample.staticMethod();

        new StaticExample();
    }
}
