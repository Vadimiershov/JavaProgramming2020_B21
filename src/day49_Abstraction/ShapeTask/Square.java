package day49_Abstraction.ShapeTask;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        if (side <= 0){
            throw  new RuntimeException("No such a square with a side of "+side);
        }
         setSide(side);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
