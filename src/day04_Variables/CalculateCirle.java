package day04_Variables;

public class CalculateCirle {

    public static void main(String[] args) {

        double radius = 7.5;
        double pi = 3.14;
        double area = radius * radius * pi;
        double perimeter = 2 * radius * pi;

        System.out.println("Area of the circle is: ");
        System.out.println(area);
        System.out.println("Perimeter of the circle is: ");
        System.out.println(perimeter);


    }


}

/*
Task03: CalculateCircle
     write a program that can calulate the area and permeter of the circle based on the given radius
        Hints: Area of circle = r * r * PI
              Perimeter of circle = 2 * r * PI
 */