package com.company.akotsenko;

public class Square extends Figure{

    int a = 5;

    @Override
    double getPerimeter() {
        return a * 4;
    }
}
