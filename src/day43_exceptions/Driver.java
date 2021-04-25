package day43_exceptions;

public class Driver {

    public static void main(String[] args) {

        String browserName = "Cybertek";

        switch (browserName.toLowerCase()){
            case "chrome":
                System.out.println("Chrome is selected");
                break;

            case"firefox":
                System.out.println("Firefox is  selected");
                break;

            case"safari":
                System.out.println("Safari is selected");
                break;

            case"opera":
                System.out.println("Opera is selected");
                break;

            default:
                //throw new RuntimeException("No Such A Browser Named "+browserName);
        }

        System.out.println("-----------------------------------------------------------------------");

        throw new ClassCastException("Invalid Class");


    }



}
