package day16_Scanner;

import java.util.Scanner;

public class BrowserType {

    public static void main(String[] args) {

        System.out.println("Please enter a browser type");

        Scanner input = new Scanner(System.in);
        String browser = input.nextLine();

        input.close();

        switch (browser){

            case ("opera") :
                System.out.println("Opera is open");
                break;

            case"firefox":
                System.out.println("Firefox is open");
                break;

            case "chrome" :
                System.out.println("Chrome is open");
                break;

            case "safari" :
                System.out.println("Safari is open");
                break;

            default:
                System.out.println(browser + " is not valid");

        }


    }


}
