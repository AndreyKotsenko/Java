package com.company.akotsenko;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Byte bt;
        Short shrt;
        Integer integer;
        Long lng;
        Boolean bln;
        Character chr;
        Float fl;
        Double db;

        List<Integer> list;

        Integer i = new Integer(6);
        Integer a = new Integer("6");
        int k = Integer.parseInt("3");
        Integer.valueOf("3");
        short s = i.shortValue();

        Integer t1 = 128;
        Integer t2 = 128;
        if( t1 == t2) {
            System.out.println("==");
        }

        String name = "Andrey";
        String name2 = "Andrey";
        String name3 = new String("Andrey");

        if(name == name2) {
            System.out.println("equals1");
        }

        if(name == name3) {
            System.out.println("equals2");
        }

        if(name.equals(name3)) {
            System.out.println("equals3");
        }

        /*
        == - compares objects in memory
        equals() - compares values
        always use equals() for objects
         */
    }
}
