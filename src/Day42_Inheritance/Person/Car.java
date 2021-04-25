package Day42_Inheritance.Person;

public class Car {

    public String brand, model, color, madeIn,type;
    public int year;

    public static boolean hasEngine, hasWheel, hasTires;

    static {
        hasEngine = true;
        hasWheel = true;
        hasTires = true;
    }

    public void setInfo(String brand, String model, String color, String madeIn, int year, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.year = year;
        this.type = type;
    }

    public void drive(){
        System.out.println(brand+" "+model+", is driving");
    }


}
