package com.teachmeskills.lesson9.task1.figure;

public abstract sealed class Figure permits Circle, Rectangle, Triangle {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getName();
}
