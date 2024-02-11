package com.teachmeskills.lesson9.task1.figure;

public non-sealed class Triangle extends Figure {
    public String name = "Triangle";
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public String getName() {
        return name;
    }
}
