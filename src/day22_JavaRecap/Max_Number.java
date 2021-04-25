package day22_JavaRecap;

import java.util.Scanner;

public class Max_Number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -999999999; // user not likely to enter a number that greater than this

        for(int i=1; i<=10; i++) {

            System.out.println("Enter a number: ");
            int n = scan.nextInt();
            if (n > max) {
                max = n;
            }
            System.out.println("max number is: "+max);
        }



    }




}
