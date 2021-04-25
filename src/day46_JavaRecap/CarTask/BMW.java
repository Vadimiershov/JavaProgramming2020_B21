package day46_JavaRecap.CarTask;

public class BMW extends CarTask{


    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting "+brand+ " "+ model+" by calling mechanic");
    }

    public void autoPark(){
        System.out.println("Auto parking "+ brand+ " "+model);
    }


}
