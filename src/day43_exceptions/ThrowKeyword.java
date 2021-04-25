package day43_exceptions;

import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = scan.nextInt();

        if(age< 0 || age > 150){
            throw new RuntimeException("Invalid Age Number entered");
        }

        if(age>=21){
            System.out.println("Eligible ");
        }else {
            System.out.println("Not Eligible");
        }

        scan.close();





    }



}
