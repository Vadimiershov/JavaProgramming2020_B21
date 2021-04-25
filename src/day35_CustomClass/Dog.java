package day35_CustomClass;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dog {

    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DOB;
    public int age;
    //sets the instance of dog objects
    public void setInfo(String dogNickName, String dogBreed, String dogSize,char dogGender, String dogColor, LocalDate dogDateOfBirth){
        nickName = dogNickName;
        breed = dogBreed;
        size = dogSize;
        gender = dogGender;
        color = dogColor;
        DOB = dogDateOfBirth;
        age = LocalDate.now().getYear()-DOB.getYear();
    }

    public void getInfo(){
        System.out.println("Name: "+nickName+", Breed: "+breed+", Gender"+gender+", Color"+color+", Size"+size+", Age: "+
                (LocalDate.now().getYear() - DOB.getYear()));

    }

    public void eat(String food){
        System.out.println(nickName +" is eating "+food);
    }

    public void drink(String drink) {
        System.out.println(nickName+ " is drinking "+drink);
    }

}
