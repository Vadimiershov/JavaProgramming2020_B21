package day46_JavaRecap.CarTask;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;

public class CarTask {

    public static int numbersOfTires = 4;
    public static boolean hasEngine, hasSeats;
    public String brand, model, color;
    public int year;
    public double price;

    public CarTask(String brand, String model, String color, int year, double price) {
        if(year > LocalDate.now().getYear()+1 || year <= 0){
            throw new InputMismatchException("Invalid year cannot be negative " + year);
        }

        if(price <=0){
            throw new RuntimeException("Car price cannot be negative" + price);
        }

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarTask{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(brand + " " + model + " is starting");
    }

    public final void driving(){
        System.out.println(brand + " " + model + " is driving");
    }





}


