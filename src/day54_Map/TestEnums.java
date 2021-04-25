package day54_Map;

import java.time.Month;

public class TestEnums {

    enum Month{
        May,April,June;
    }

    public static void main(String[] args) {

        String browserName = "Chrome";
        Browsers browserName2 = Browsers.Chrome;
        Month month2 = Month.June;
        System.out.println(month2);


        switch (browserName2){
            case Chrome:
                System.out.println("Chrome is selected");
                break;

            case Firefox:
                System.out.println("Firefox is selected");
                break;

            default:
                System.out.println("Safari is selected");
        }

        String string = "Cybertek";
        string.concat(" School");
        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School");
        System.out.println(stringBuilder);




    }
}
