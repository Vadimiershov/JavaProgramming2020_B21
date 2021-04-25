package day40_Constructor;

public class Rectangle {

    public static int numberOfSides;

    public double width, length, area, perimeter;

    static {
        numberOfSides = 4;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.area = width * length;
        this.perimeter = (width*length)*2;
        numberOfSides = 4;
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", numberOfSides=" + numberOfSides+
                '}';
    }
}

class RectangleObjects{

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,5);


        System.out.println(rectangle1);


    }

}

