package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class ParkingLot {

    public static void main(String[] args) {

        Car [] cars = {new Car(),new Car(),new Car(),new Car(),new Car(),};

        cars[0].setInfo("BMW", "i8","Black", LocalDate.of(2015,5,20),120000,32000);
        cars[1].setInfo("BMW", "m4","Black", LocalDate.of(2016,6,20),130000,42000);
        cars[2].setInfo("BMW", "m4","Black", LocalDate.of(2017,7,20),140000,52000);
        cars[3].setInfo("BMW", "i8","Black", LocalDate.of(2018,8,20),150000,672000);
        cars[4].setInfo("BMW", "x5","Black", LocalDate.of(2019,9,20),160000,72000);

        ArrayList<Car> recall = new ArrayList<>();

        for (Car each:cars){
            if(each.brand.equals("BMW")&&each.year<2017){
                recall.add(each);
            }
        }
        System.out.println(recall);

    }



}
