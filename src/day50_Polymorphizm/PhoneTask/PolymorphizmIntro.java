package day50_Polymorphizm.PhoneTask;

import day49_Abstraction.RemoteDriverClass.ChromeDriver;
import day49_Abstraction.RemoteDriverClass.CybertekDriver;
import day49_Abstraction.RemoteDriverClass.FirefoxDriver;
import day49_Abstraction.RemoteDriverClass.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;

import java.util.ArrayList;

public class PolymorphizmIntro {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone 12","Small","Black",1200);

        Samsung samsung1 = new Samsung("Galaxy 20","Medium","White",900);

        Phone phone1 = new Samsung("Galaxy S21","Medium","Grey",690);

        Phone phone2 = new Iphone("Ipohne2","Small","Black",1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(samsung1);
        phones.add(iphone1);

        Shape shape;

        shape = new Rectangle(3,4);

        System.out.println(shape.area());

        System.out.println("==========================================================");

        String browserName = "chrome";

        WebDriver driver;

        switch(browserName){

            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "cybertek":
                driver = new CybertekDriver();
                break;

            default:
                throw new RuntimeException("Invalid Browser Name");

        }



    }



}
