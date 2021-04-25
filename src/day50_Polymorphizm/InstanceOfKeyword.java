package day50_Polymorphizm;


import Day42_Inheritance.Animals.Animal;
import Day42_Inheritance.Animals.Cat;
import Day42_Inheritance.Animals.Dog;

public class InstanceOfKeyword {

    public static void main(String[] args) {

        Animal animal = new Dog("xx","yy",'m',2,"black","medium");

        boolean isDog = animal instanceof Dog;
        boolean isCat = animal instanceof Cat;

        System.out.println("isDog = " + isDog);
        System.out.println("isCat = "+ isCat);




    }


}
