package com.company.akotsenko;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
	    m.someMethod();
        try {
            m.someMethod2();
        } catch (MyException e) {
            e.print();

        }
    }

    void someMethod() {
        try{
            Objects o = null;
            o.hashCode();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }

    void someMethod2() throws MyException{
        throw new MyException();
    }
}
