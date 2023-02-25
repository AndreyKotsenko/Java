package com.company.akotsenko;

public class Person {
    public String name = "Max"; //bad code cause we use public for field

    private int age = 10;

    int count = 5;
    protected String secondName = "Jojo";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
