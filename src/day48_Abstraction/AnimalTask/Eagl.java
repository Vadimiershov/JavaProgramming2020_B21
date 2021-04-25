package day48_Abstraction.AnimalTask;

public class Eagl extends Animal implements Predator, Flyable{

    public Eagl(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Eagles sleeps 6 hours");
    }


    @Override
    public void hunt() {
        System.out.println("Eagle hunts snake");
    }

    @Override
    public void fly() {

    }
}
