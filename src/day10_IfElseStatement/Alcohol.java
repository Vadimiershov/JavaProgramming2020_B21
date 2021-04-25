package day10_IfElseStatement;

public class Alcohol {

    public static void main(String[] args) {

        int age = 20;

        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
        System.out.println("===============================================================");

        int year = 2021;

        boolean leapYear = year %4 == 0;

        if(leapYear){
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }
        System.out.println("================================================================");

        String breakTime = "yes";

        if(breakTime == "yes"){
            System.out.println("Take your break");
        }else{
            System.out.println("Keep study");
        }

    }


}
