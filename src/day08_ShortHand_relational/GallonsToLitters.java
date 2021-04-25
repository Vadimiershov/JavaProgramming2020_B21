package day08_ShortHand_relational;

public class GallonsToLitters {

    public static void main(String[] args) {

        int gallons = 100;
        double litters = gallons * 3.785;
        int result = (int) litters;

        System.out.println(gallons + " gallons equal to " + result + " litters");
        System.out.println(gallons + " gallons equal to " + (int)(gallons * 3.785) + " litters");



    }


}


/*
 write a program that converts the given number of gallons to liters.
                Note: MUST return integer result
                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liters

 */