package day18_StringPractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double n1 = input.nextDouble();

        System.out.println("Enter math operator: ");
        char operator = input.next().charAt(0);

        System.out.println("Enter a number: ");
        double n2 = input.nextDouble();

        boolean isValid = operator=='*' || operator=='/' || operator=='%' || operator=='+' || operator=='-';

        if(isValid){
            if(operator=='*'){
                System.out.println("Multiplication: "+(n1*n2));

            }else if(operator=='/'){
                System.out.println("Division: "+(n1/n2));
            }else if(operator=='%'){
                System.out.println("Remainder: "+(n1%n2));
            }else if(operator=='+'){
                System.out.println("Addition: "+(n1+n2));
            }else{
                System.out.println("Substraction: "+(n1-n2));
            }



        }else{
            System.out.println("Invalid operator is entered");
        }





    }


}
