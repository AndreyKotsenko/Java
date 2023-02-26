package com.company.akotsenko;

public class Main {

    public static void main(String[] args) {
        Overload test = new Overload();

        System.out.println(test.addTwoDigits(1, 2));
        System.out.println(test.addTwoDigits(1.56, 2.23));

        OverloadChild test2 = new OverloadChild();

        System.out.println(test2.addTwoDigits(1, 2));
        System.out.println(test2.addTwoDigits(1.56, 2.23));
        System.out.println(test2.addTwoDigits(20.45, 34.5, "hi"));
        test2.addTwoDigits(1);
    }
}

class OverloadChild extends Overload {
    void addTwoDigits(int j){
        System.out.println(j);
    }
}
