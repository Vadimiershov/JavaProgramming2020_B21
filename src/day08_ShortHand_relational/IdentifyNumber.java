package day08_ShortHand_relational;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -200;
        boolean r1 = number > 0;
        boolean r2 = number < 0;
        boolean r3 = number == 0;

        System.out.println(number + " is positive number: " + r1);
        System.out.println(number + " is negative number: " + r2);
        System.out.println(number + " is zero: " + r3);

        int angel1 = 30;
        int angel2 = 30;
        int angel3 = 90;
        int sum   = 150;
        int angelTotal = angel1 + angel2 + angel3;


        boolean isValid = sum == angelTotal;

        System.out.println("The triangle is valid: " + isValid);


    }


}
