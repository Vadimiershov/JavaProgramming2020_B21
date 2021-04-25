package day21_While_DoWhile;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0; // 5+10+5+5

        for (int i=0; i<1;) {

            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num<0) {
                break;
            }
            result += num;
        }

        scan.close();
        System.out.println(result);
    }



}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

 */