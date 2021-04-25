package day18_StringPractice;

import java.util.Scanner;

public class StringPractices2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Apple product name");
        String product = scan.nextLine();
        product = product.replace(" ", "").toLowerCase();


        switch (product){
            case "macbook":
                System.out.println("Which model Macbook would you like?");
                String model = scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("Macbook Air is $2400");
                }else if(model.equalsIgnoreCase("pro")){
                    System.out.println("MacBook Pro is $2500");
                }else{
                    System.out.println("Invalid model for Macbook");
                }
                break;

            case "iphone":
                System.out.println("Which model Iphone would you want");
                String model2 =  scan.nextLine().toLowerCase();
                if(model2.equals("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if(model2.equals("11")){
                    System.out.println("Iphone 11 is $900");
                }else if(model2.equals("10")){
                    System.out.println("Iphone 10 is $800");
            }else if(model2.equals("8")){
                    System.out.println("Iphone 8 is $700");
                }else {
                    System.out.println("Invalid model for Iphone");
                }


                break;

            case "ipad":
                System.out.println("Which model of Ipad would you like?");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3){
                    case "air":
                        System.out.println("Ipad AIR is $500");
                        break;
                    case "pro":
                        System.out.println("Ipad PRO is $400");
                        break;
                    case "mini":
                        System.out.println("Ipad MINI is $300");
                        break;
                    default:
                        System.out.println("Invalid model for iPad");
                }
                break;

            default:
                System.out.println("Invalid product name");
        }




    }


}
