package day15_Scanner;

import java.util.Scanner;

public class Scanner_Byte_Long_Boolean {

    public static void main(String[] args) {

        System.out.println("Please enter your age");

        Scanner input = new Scanner(System.in);

        byte age = input.nextByte();



        System.out.println("Please enter your favourite number: ");

        long favNumber =  input.nextLong();



        System.out.println("Are you a student? Enter true or false");

        boolean isStudent = input.nextBoolean();
        System.out.println("Your age is "+ age);
        System.out.println("Your favourite number is: " + favNumber);
        System.out.println("Is a student: "+ isStudent);

    }


}
