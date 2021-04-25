package day05_Concatenation;

public class Concatenation_Practice {

    public static void main(String[] args) {

        int houseNumber = 7925;
        int zipCode = 22000;
        String cityName = "McLean";
        String state = "VA";
        String streetName = "John Branch Dr";

        String fullAddress = houseNumber+" "+streetName+ ", "+"\n"+cityName+" "+state+", "+zipCode;

        System.out.println(fullAddress);

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "Red";

        String carInfo = year+" "+brand+" "+ model+", "+mileage+" miles, "+color+", $"+price;

        System.out.println(carInfo);


    }


}
