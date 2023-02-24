package com.company.akotsenko;

public class Circle extends Figure{

    int r = 10;

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
