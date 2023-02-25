package com.company.akotsenko;

public class Main {

    enum CoffeeSize { SMALL(100), MEDIUM(200), BIG(300);

        int milliliters;
        CoffeeSize(int milliliters) {
            this.milliliters = milliliters;
        }

        int getMilliliters() {
            return milliliters;
        }
    };

    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.BIG;
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.getMilliliters());
    }
}
