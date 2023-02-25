package com.company.akotsenko;

public interface ISomeInterface extends IOtherInterface {
    void addTwoDigits(int one, int two);

}


interface IOtherInterface {
    int SOME_VARIABLE = 5;  // public static final
    void someMethod();  // abstract public
}

interface IBouncable {
    void bounce();
}

class Example implements ISomeInterface, IBouncable {

    @Override
    public void addTwoDigits(int one, int two) {
        System.out.println(one+two);
    }

    @Override
    public void someMethod() {
        System.out.println("Something");
    }

    @Override
    public void bounce() {
        System.out.println("bounce");
    }
}