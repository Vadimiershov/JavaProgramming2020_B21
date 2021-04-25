package Practice_01_13_2021.AnimalTask;

public final class Cat extends Animal{

    public Cat(String name, String breed, String size, String color, char gender, int age){
        super(name,breed,size,color,gender,age);
    }

    public void eat(){
        System.out.println("Fish");
    }

    @Override
    public void speak() {
        System.out.println("myau");
    }


    @Override
    public String toString() {
        return "Cat " + '\''+
                super.toString();
    }
}
