package day47_Abstraction.CarTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start(){
        System.out.println("By the voice: say starts");
    }
}
