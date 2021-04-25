package Day42_Inheritance.Devices;

public class Phone extends Device{

    public static boolean canCall, canSendMessage, hasCamera;

    static {
        canCall = true;
        canSendMessage = true;
        hasCamera = true;
    }

    public Phone(String model, String brand, int price){
        setInfo("Iphone",model,brand,price);

    }

    public void call(){
        System.out.println(brand+" "+model+" is calling");
    }

    @Override
    public String
    toString() {
        return "Phone{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
