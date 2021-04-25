package day48_Abstraction.AnimalTask;

public class Dolphins extends Animal implements Swimmable,Playble{
    public Dolphins(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphins sleeps 11 hours");
    }

    @Override
    public void play() {
        System.out.println("Dolphins play with humans");
    }

    @Override
    public void swim() {
        System.out.println("Dolphins swim a lot");
    }
}
