package day40_Constructor;

import day38_StaticKeyword.Circle;

public class Circle1 {

    public static double PI = 3.14;

    public double radius, diameter, area, perimeter;

    public Circle1(double radius) {
        this.radius = radius;
        diameter = radius*2;
        area = radius * radius * PI;
        perimeter = diameter * PI;

    }

}

class CircleObjects{

    public static void main(String[] args) {

        Circle1 circle1 = new Circle1(5);

        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);


    }

}