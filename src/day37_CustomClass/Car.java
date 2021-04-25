package day37_CustomClass;

import java.time.LocalDate;

public class Car {

    public String brand, model, color;
    public LocalDate DofB;
    public double price, mileage;
    public int year;

    public void setInfo(String brand, String model, String color, LocalDate DofB, double price, double mileage) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.DofB = DofB;
        this.price = price;
        this.mileage = mileage;
        year = DofB.getYear();
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", DofB=" + DofB +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                '}';
    }

    public void driver(){
        System.out.println("Driving "+brand+" "+model);
    }



}
