package Day42_Inheritance.Devices;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv1 = new TV("LG","1042",350);
        Phone iphone5 = new Phone("5","Iphone",300);
        System.out.println(tv1);
        System.out.println(iphone5);
        iphone5.call();


    }


}
