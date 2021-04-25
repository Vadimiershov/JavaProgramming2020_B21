package Day42_Inheritance.CarTask;

public class CarObject {

    public static void main(String[] args) {

        Honda honda = new Honda("Civic", "Red",20000,2005);
        honda.start();
        System.out.println(honda);

        Mercedes mercedes = new Mercedes("E320","Red",50000,2015);
        mercedes.start();
        System.out.println(mercedes);

        Jeep jeep = new Jeep("Cherokee","White",55000,2019);
        jeep.start();
        System.out.println(jeep);




    }


}
