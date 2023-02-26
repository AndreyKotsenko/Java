package com.company.akotsenko;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent child = new Child();

        parent.printSmt();
        child.printSmt();

        System.out.println(parent.test());
        System.out.println(child.test());

        try {
            parent.ex();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            child.ex();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class Parent {

    protected void printSmt() {
        System.out.println("Something");
    }

    Parent test(){
        return new Parent();
    }

    void go() throws Exception {
        System.out.println(" go ");
    }

    void run() throws IOException {
        System.out.println(" go ");
    }


    void ex() throws Exception {

    }
    
}

class Child extends Parent {

//    @Override          // error because protected higher level than default
//    void printSnt() {
//        System.out.println("Something else");
//    }

    @Override
    public void printSmt() {
        System.out.println("Something else");
    }

    @Override
    Child test(){
        return new Child();
    }

    @Override
    void go() throws IOException {
        System.out.println(" go ");
    }

//    @Override                   // error because Exception higher level than IOException
//    void run() throws Exception {
//        System.out.println(" go ");
//    }

    @Override
    void ex() {

    }


}