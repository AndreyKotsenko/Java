package com.company.akotsenko;

public class Main {

    void userCar(Car car) {
        car.driving();
        System.out.println(car.getNumsOfSeets());
    }

    public static void main(String[] args) {
        //first example with dynamic polymorphism
	    Main main = new Main();
	    Car car = new Toyota();
	    main.userCar(car);

	    //second example with dynamic polymorphism
        Figure figure = new Figure();
        Figure circle = new Circle();
        Figure square = new Square();

        System.out.println(figure.getPerimeter());
        System.out.println(circle.getPerimeter());
        System.out.println(square.getPerimeter());

        //third example with static polymorphism

        System.out.println(Calculator.add(5,10));
        System.out.println(Calculator.add(15.34, 30.23));
    }
}
