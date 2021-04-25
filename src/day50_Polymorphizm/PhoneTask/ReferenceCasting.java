package day50_Polymorphizm.PhoneTask;

import Day42_Inheritance.Animals.Animal;
import Day42_Inheritance.Animals.Cat;
import Day42_Inheritance.Animals.Dog;
import day47_Abstraction.ShapeTasks.Circle;
import day47_Abstraction.ShapeTasks.Shape;
import day49_Abstraction.ShapeTask.Cylinder;

public class ReferenceCasting {

    public static void main(String[] args) {

        // implicit casting: smaller to larger
        int a = 10;
        double b = a;

        // explicit casting: casting the larger one to the smaller one
        double d = 10.5;
        int c = (int) d;

        System.out.println("================================================================");

        Circle circle = new Circle(3);
        Shape shape = circle; // Upcasting == implicitCasting


        //down casting:

        Animal animal = new Dog("Lucy","Husky",'M',12,"White","Small");
        Dog dog = (Dog) animal;
        dog.bark();

        Animal animal2 = new Cat("John","MeyKun","Suzi","Grey",'m',3);
        ((Cat)animal2).meow();

        System.out.println("=========================================================================");


    }



}
