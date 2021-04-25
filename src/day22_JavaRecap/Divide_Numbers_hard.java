package day22_JavaRecap;

import java.util.Scanner;

public class Divide_Numbers_hard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int count = 0;

        while(a>=b){
            a -=b;
            count++;
        }

        System.out.println(count+" with a remainder of "+ a);


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