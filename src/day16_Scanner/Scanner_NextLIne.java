package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLIne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address");
        String address = input.nextLine();

        System.out.println("Address: " + address);



    }


}
