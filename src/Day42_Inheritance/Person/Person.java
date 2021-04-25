package Day42_Inheritance.Person;

public class Person {

    public String name;
    public char gender;
    public int age;

    public void setInfo(String name, char gender,int age){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public void personEat(){
        System.out.println(name+" able to eat");
    }

    public void personSleep(){
        System.out.println(name+" able to sleep");
    }




}
