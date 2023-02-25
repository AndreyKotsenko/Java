package com.company.akotsenko;

public class Main {

    public static void main(String[] args) {
	    ISomeInterface test = new Example();

	    test.addTwoDigits(5, 10);
	    //test.bounce(); error because interface ISomeInterface haven't this method

        Example testTwo = new Example();

        testTwo.addTwoDigits(6, 10);
        testTwo.bounce();
        testTwo.someMethod();
    }
}
