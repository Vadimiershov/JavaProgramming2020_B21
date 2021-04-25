package Practice_01_27_2021;

import day43_exceptions.PhoneTask.Iphone;
import day43_exceptions.PhoneTask.Phone;

public class UpDownCasting {

    public static void main(String[] args) {

        Phone phone = new Iphone("12 Pro",1100);
        ((Iphone)phone).faceTime(12345);

        Iphone iphone = (Iphone) phone;
        iphone.faceTime(12345);



    }



}
