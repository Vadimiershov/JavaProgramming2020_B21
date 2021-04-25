package Day42_Inheritance.Animals;

public class Dog extends Animal {

    public Dog(String name,String breed, char gender,int age, String color,  String size){
        super(name,breed, color,  size, gender, age);






    }

public void bark(){
    System.out.println("the dog is barking");
}

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}


