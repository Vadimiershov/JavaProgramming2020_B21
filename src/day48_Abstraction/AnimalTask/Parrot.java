package day48_Abstraction.AnimalTask;

public class Parrot extends Animal implements Flyable, Playble{

    public Parrot(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Parrots sleeps 15 hours");
    }


    @Override
    public void fly() {
        System.out.println("Parrots able to fly");
    }

    @Override
    public void play() {
        System.out.println("Parrots talk with humans");
    }
}
