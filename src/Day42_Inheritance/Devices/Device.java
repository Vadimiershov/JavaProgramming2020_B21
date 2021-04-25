package Day42_Inheritance.Devices;

public class Device {

    public String deviceName, brand, model;
    public int price;

    public static String madeIn;
    public static boolean hasBattery, hasPowerButton;

    static {
        madeIn= "China";
        hasBattery = true;
        hasPowerButton = true;
    }

    public void setInfo(String deviceName,String brand,String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.deviceName = deviceName;
    }


    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void turnOff(){
        System.out.println("Turning off "+brand+" "+model);
    }

    public void turnOn(){
        System.out.println("Turning on "+brand+" "+model);
    }
}
