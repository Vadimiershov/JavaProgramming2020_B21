package day48_Abstraction.AnimalTask;

public class Dog extends Animal implements Playble{

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 8 hours");
    }


    @Override
    public void play() {
        System.out.println("Dog sleeps 8 hours");
    }
}
