package Practice_01_13_2021.AnimalTask;

public abstract class Animal {

    public String name, size, color;
    public final String breed;
    public final char gender;
    public int age;

    public static boolean isAnimal;

    public static int numberOfEyes = 2;


    public Animal(String name, String breed, String size, String color, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public abstract void eat();

    public abstract void speak();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age;
    }
}
