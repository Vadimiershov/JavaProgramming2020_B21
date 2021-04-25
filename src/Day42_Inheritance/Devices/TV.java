package Day42_Inheritance.Devices;

import day20_ForLoop.SumOfUserEnterNumbers;

public class TV extends Device {

    public TV(String brand, String model, int price){
        setInfo("TV",brand,model,price);
    }

    public static boolean hasChannel, hasCable;

    static {
        hasCable = true;
        hasChannel = true;
    }

    public void channelUP(){
        System.out.println("Channel Up "+brand+" "+model);
    }

    public void channelDown(){
        System.out.println("Channel down "+brand+" "+model);
    }

    @Override
    public String toString() {
        return "TV{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
