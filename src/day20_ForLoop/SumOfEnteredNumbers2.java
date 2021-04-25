package day20_ForLoop;

import java.util.Scanner;

public class SumOfEnteredNumbers2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the final number");
        int n1 = input.nextInt();
        input.close();

        int result = 0;

        if(n1>=1) {
            for (int i = 0; i <= n1; i++) {
                result += i;

            }
        }else{
            System.err.println("Invalid entry");
        }
        System.out.println(result);

    }


}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050
                input: 50
                output: 1275

 */