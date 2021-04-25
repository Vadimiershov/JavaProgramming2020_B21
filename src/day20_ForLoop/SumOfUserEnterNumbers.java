package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnterNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

   /*     System.out.println("Enter a number");
        int n1 = input.nextInt();

        System.out.println("Enter a number");
        int n2 = input.nextInt();

        System.out.println("Enter a number");
        int n3 = input.nextInt();

        System.out.println("Enter a number");
        int n4 = input.nextInt();

        System.out.println("Enter a number");
        int n5 = input.nextInt();

        int sum = n1+n2+n3+n4+n5;

        System.out.println(sum);

        System.out.println("=========================================================================");
    */

        int times = input.nextInt();
        int result = 0;  //to contain the sum of each user entered number
        for(int i=1; i<=times;i++){

        System.out.println("Enter a number");
        result += input.nextInt();

    }
        System.out.println(result);






    }



}




/*
write a program that can calculate the sum of 5 user entered input
 */