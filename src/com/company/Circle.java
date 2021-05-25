package com.company;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return  Math.PI * Math.pow(getRadius(), 2);

    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();

    }
}
