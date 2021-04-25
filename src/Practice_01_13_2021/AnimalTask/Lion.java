package Practice_01_13_2021.AnimalTask;

public final class Lion extends Animal{


    public Lion(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void eat(){
        System.out.println("Meat");
    }

    public void speak(){
        System.out.println("Woof");
    }

    public String toString(){
        return "Dog"+super.toString();
    }



}
