package day47_Abstraction.ShapeTasks;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(4);

        System.out.println(circle1.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());



    }




}
