package com.company.akotsenko;

public class ConstructorExample extends Parent{
    int i;

    ConstructorExample(){
        super("Max");
        System.out.println("I am created");
    }

    ConstructorExample(String hello, int i) {
        super("Andrey");
        this.i = i;
        System.out.println(hello);
    }

    ConstructorExample(String name) {
        super(name); // called constructor from Parent/ it is required
    }
}


class Parent {
    Parent(String name) {
        System.out.println("Parent " + name);
    }
}