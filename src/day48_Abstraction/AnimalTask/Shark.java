package day48_Abstraction.AnimalTask;

public class Shark extends Animal implements Swimmable{

    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }



    @Override
    public void sleep() {
        System.out.println("Shark usually sleep 5 hours");
    }


    @Override
    public void swim() {
        System.out.println("Shark swim very well");
    }
}
