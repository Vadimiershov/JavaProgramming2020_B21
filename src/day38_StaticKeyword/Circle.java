package day38_StaticKeyword;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, area, circumference;

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
        area = CalculateArea();
        circumference = calculatePerimeter();

    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", circumference=" + df.format(circumference) +
                '}';
    }

    public double CalculateArea(){
        return radius* radius * Math.PI;
    }

    public double calculatePerimeter(){
        return diameter * Math.PI;
    }

    public boolean equals(Circle circle){
        return this.radius == circle.radius;
    }
    }




