package day47_Abstraction.CarTask;

public class CarShop {

    public static void main(String[] args) {

    Mercedes mercedes = new Mercedes("C300","Black",2010,10000);
    Toyota toyota = new Toyota("Toyota","Camry","White",2017,2000);
    //BMW bmw = new BMW("X5","Silver",2015,29000);
        BMW bmw = new BMW("X5","Silver",2015,29000);

        System.out.println("Start Mercedes- ");
        mercedes.start();

        System.out.println("Start toyota- ");
        toyota.start();

    }


}
