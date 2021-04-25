package day50_Polymorphizm;

import Day42_Inheritance.Animals.Animal;
import Day42_Inheritance.Animals.Cat;
import Day42_Inheritance.Animals.Dog;
import Day42_Inheritance.CarTask.Car;
import Day42_Inheritance.Person.Toyota;
import day49_Abstraction.RemoteDriverClass.*;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.Shape;
import day49_Abstraction.ShapeTask.Volume;
import day50_Polymorphizm.PhoneTask.Iphone;
import day50_Polymorphizm.PhoneTask.Phone;
import day50_Polymorphizm.PhoneTask.Samsung;

public class DownCasting {

    public static void main(String[] args) {

        Shape shape = new Cylinder(3,5);
        //Cylinder cylinder = (Cylinder) shape;
        //cylinder.volume();


        ((Cylinder)shape).volume();

        System.out.println("====================================================================");

        Animal animal = new Cat("John","MeyKun","Suzi","Grey",'m',3);
        //((Dog)animal).bark();

        System.out.println("====================================================================");

        Phone phone = new Samsung("Galaxy S20","large","white",1050);
        //((Iphone)phone).call();
        System.out.println(phone);

        WebDriver driver = new ChromeDriver();
        ((TakeScreeshot)driver).TakeScreeshot("pic");
        ((JavaScriptExecutor)driver).executeScript("");

        System.out.println("=======================================================================");

        Shape shape2 = new Circle(3);
        ((Volume)shape2).volume();

        System.out.println("================================================================");

        RemoteDriver dr1 = new FirefoxDriver();
        JavaScriptExecutor js = new FirefoxDriver();



    }


}
