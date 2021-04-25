package day46_JavaRecap.CarTask;

public class CarMax {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("G class","red",2021,300000);
        Lexus lexus = new Lexus("RX 350","White", 2018,20000);
        BMW bmw = new BMW("X6","Black",2019,45000);
        Tesla tesla = new Tesla("Model 3","Blue", 2020, 48000);

        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("==================================================================");

        mercedes.driving();
        bmw.driving();
        lexus.driving();
        tesla.driving();

        System.out.println("=====================================================================");

        bmw.autoPark();





    }



}
