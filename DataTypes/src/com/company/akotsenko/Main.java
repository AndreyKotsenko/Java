package com.company.akotsenko;

public class Main {

    // primitive types
    byte b = 0; //1 byte(256) -128 ... +128
    short s = 1234; // 2 byte -32k .... 32k
    int i = 23232352; // 4 byte
    long l = 3422323; // 8 byte
    float f = 12.324f; // 4 byte
    double d = 1234.3252352; // 8 byte
    boolean bool = false;
    char c = 'c';

    // reference types
    Main main = new Main();

    // main function
    public static void main(String[] args) {
	    System.out.println("Hello world!");


    }

/*
This is like main function. Another way to run the program
    static{
        System.out.println("Hi");
        System.exit(0);
    }

 */
}
