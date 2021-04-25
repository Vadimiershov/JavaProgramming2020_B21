package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLine2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Name " +fullName);
        System.out.println("Age "+ age);



    }


}
