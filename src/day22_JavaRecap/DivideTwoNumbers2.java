package day22_JavaRecap;

import java.util.Scanner;

public class DivideTwoNumbers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int count = 0;

        for (count = 0; a >= b; count++){
            a -= b;
        }
        System.out.println(count+" with a reminder " + a);


    }



}
/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput:
                        3 with a remainder of 1
Collapse
 */