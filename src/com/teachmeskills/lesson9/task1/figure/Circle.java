package com.teachmeskills.lesson9.task1.figure;

public final class Circle extends Figure {
    public String name = "Circle";
    public double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String getName() {
        return name;
    }
}
