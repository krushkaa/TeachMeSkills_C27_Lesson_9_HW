package com.teachmeskills.lesson9.task1.runner;

import com.teachmeskills.lesson9.task1.figure.*;

public class Runner {
    public static void main(String[] args) {
        Circle cr1 = new Circle("Circle1", 20);
        Circle cr2 = new Circle("Circle2", 5);
        Rectangle rcgl1 = new Rectangle("Rectangle", 3, 4);
        Triangle trgl1 = new Triangle("Triangle1", 12, 9, 7);
        Triangle trgl2 = new Triangle("Triangle2", 3, 4, 5);

        Figure[] fig = new Figure[]{cr1, cr2, rcgl1, trgl1, trgl2};
        double totalPerimeterSum = 0;
        for (Figure x : fig) {
            System.out.println(x.getName() + "; area = " + x.getArea() + "; perimeter = " + x.getPerimeter());
            totalPerimeterSum += x.getPerimeter();
        }
        System.out.println("Сумма периметров всех фигур: " + totalPerimeterSum);
    }
}