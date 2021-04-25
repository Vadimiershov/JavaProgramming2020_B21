package day48_Abstraction.AnimalTask;

public class Lion extends Animal implements Predator{

    public Lion(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    public void sleep(){
        System.out.println("lion sleeps 10 hours");
    }

    public void hunt(){
        System.out.println("lions hunts deer");
    }

}
