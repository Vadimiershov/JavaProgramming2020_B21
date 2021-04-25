package day43_exceptions.PhoneTask;

public class Samsung extends Phone{

    public Samsung(String model, double price) {
        super("Samsung", model, "South Korea", price);
    }

    public void freeze(){
        System.out.println(brand+" "+ model+" is freezing");
    }



}
