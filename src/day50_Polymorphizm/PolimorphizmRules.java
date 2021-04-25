package day50_Polymorphizm;

import Day42_Inheritance.Animals.Animal;
import Day42_Inheritance.Animals.Dog;
import day47_Abstraction.CarTask.BMW;
import day47_Abstraction.CarTask.Car;
import day47_Abstraction.CarTask.Tesla;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Shape;

public class PolimorphizmRules {

    public static void main(String[] args) {

        Dog dog = new Dog("A","Husky",'M',12,"white","medium");
        dog.bark();

        Animal animal = new Dog("A","Husky",'M',12,"white","medium");
        animal.eat("Dog food");

        Cube cube = new Cube(5);
        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());
        Shape shape = new Cube(5);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());

        System.out.println("=========================================================================");

        Tesla car= new Tesla("Model 3","White", 2019,45000);
        car.start();
        Car car1 = new BMW("X5","white",2018,55000);
        car1.start();

        System.out.println("=================================================================================");

        Animal animal2 = new Dog("Lucy","Husky",'M',12,"White","Small");







    }



}
