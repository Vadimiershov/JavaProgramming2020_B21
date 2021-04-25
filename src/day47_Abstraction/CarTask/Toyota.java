package day47_Abstraction.CarTask;

public class Toyota extends Car{

    public Toyota(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("insert key: twist the key to ignition");
    }


}
