package com.company;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);

    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();

    }
}
