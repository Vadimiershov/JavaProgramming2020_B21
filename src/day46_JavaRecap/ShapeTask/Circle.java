package day46_JavaRecap.ShapeTask;

public class Circle extends Shape{

    public final static double PI = 3.14;
    public double r, d;

    public Circle(double r) {
        super("Circle");
        if(r<=0) throw new RuntimeException("No such a Circle with a radius of: "+r);
        this.r = r;
        d = r * 2;
    }

    public double area(){
        return r*r*PI;
    }

    public double perimeter(){
        return d * PI;
    }



}
