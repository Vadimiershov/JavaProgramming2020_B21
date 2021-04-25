package day13_SwitchStatement;

import java.util.SortedMap;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {

        String browser = "Chrome";
        String result = "";

        switch (browser){

            case ("Chrome"):
                result = "Chrome browser is selected";
                break;

            case ("Firefox"):
                result = "Firefox broser is selected";
                break;

            case ("Opera"):
                result = "Opera browser is selected";
                break;

            case ("Safari"):
                result = "Safari browser is selected";
                break;

            case ("Edge"):
                result = "Edge browser is selected";
                break;

            case ("IE"):
                result = "IE browser is selected";
                break;

            default:
                result = "Invalid browser";



        }
        System.out.println(result);

    }


}
