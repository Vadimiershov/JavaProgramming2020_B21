package day15_Scanner;

import java.util.Scanner;

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne = input.nextInt();

        System.out.println("Enter number two: ");
        int numTwo = input.nextInt();

        System.out.println("Number one: " +numOne);
        System.out.println("Number two: "+numTwo);
        System.out.println("Sum " + (numOne+numTwo));



    }


}
