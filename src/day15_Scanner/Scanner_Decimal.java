package day15_Scanner;

import java.util.Scanner;

public class Scanner_Decimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your number: ");
        float F = input.nextFloat();
        System.out.println("Number is:"+F);

        System.out.println("Enter a double number");
        double doubleNumber = input.nextDouble();
        System.out.println("Number is "+doubleNumber);

        System.out.println(input.nextFloat()+ input.nextFloat());
        System.out.println(1+1);


    }


}
