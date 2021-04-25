package Day42_Inheritance.Person;

public class Toyota extends Car {

    public Toyota(String brand, String model, String color, String madeIn, int year,String type){
        setInfo(brand, model, color, madeIn, year, "Sedan");

    }

    public static boolean isAfordable, isImportant;

    static {
        isAfordable = true;
        isImportant = true;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", year=" + year +
                ", has a wheels "+hasWheel+
                '}';
    }
}
