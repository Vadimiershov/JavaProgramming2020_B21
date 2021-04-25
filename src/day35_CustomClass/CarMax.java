package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Toyota", "Camry","White",2017,20000);

        car2.setInfo("Honda", "Accord","Silver",1990,10000);

        car3.setInfo("Mercedes","C300","Red", 2014,20000);

        car4.setInfo("Mercedes","S500","Black", 2018,150000);

        car5.setInfo("Mercedes","ML450","Yellow", 2015,10000);

        Car[] cars = { car1, car2, car3, car4, car5};

        for (Car each : cars){
            each.getInfo();
        }

        System.out.println("=========================================================================================");

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars));

        carList.removeIf( p-> p.price < 25000);

        for(int i=0; i <= carList.size()-1; i++){
            carList.get(i).getInfo();
        }


    }



}
