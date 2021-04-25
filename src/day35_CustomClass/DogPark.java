package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DogPark {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();

        dog1.setInfo("Tima","York","small", 'm',"multicolor",
                LocalDate.of(2010,05,11));
        dog1.getInfo();

        dog2.setInfo("Balli","Maltese","small", 'F',"white",
                LocalDate.of(2015,8,23));
        dog2.getInfo();

        dog3.setInfo("Richard","Chow Chow","medium", 'F',"brown",
                LocalDate.of(2017,8,23));
        dog3.getInfo();

        dog2.eat("Chicken");

        dog3.drink("Beer");

        Dog[] dogs = {dog1,dog2,dog3};
        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> maltese = new ArrayList<>();

        for(Dog eachDog:dogs){
            if(eachDog.breed.equals("Husky")){
                huskies.add(eachDog);
            }else if(eachDog.breed.equals("Maltese")){
                maltese.add(eachDog);
            }
        }

        System.out.println("Total number of huskies: "+huskies.size());
        System.out.println("Total number of maltese: "+maltese.size());



    }



}
