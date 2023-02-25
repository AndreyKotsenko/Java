package com.company.akotsenko;

import test.Test;

public class Main {

    public static void main(String[] args) {

        // here we will use public field.
        Person person = new Person();
        System.out.println(person.name);

        // here we will use private field

        person.setAge(20);
        System.out.println(person.getAge());


        //access modifiers
        Test test = new Test();

        System.out.println(test.a);
        //System.out.println(test.b); error because private
        //System.out.println(test.c); error because protected
        //System.out.println(test.d); error because default

        Person testPerson = new Person();

        System.out.println(testPerson.name);
        System.out.println(testPerson.count); // it is works because default modifier available at package level
        System.out.println(testPerson.secondName); // it is works because protected modifier available at package level and child classes
        //System.out.println(testPerson.age); error because private

    }
}
