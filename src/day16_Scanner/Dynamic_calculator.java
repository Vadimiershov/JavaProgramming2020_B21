package day16_Scanner;

import java.util.Scanner;

public class Dynamic_calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first number:");
        double num1 = input.nextDouble();

        System.out.println("Please enter the second number");
        double num2 = input.nextDouble();

        System.out.println("Please enter the operator ");
        String operator = input.next();

        input.close();

        double result = 0;
        boolean isValid = true;

        switch (operator){

            case "+" :
                result  = num1 + num2;
                break;

            case "-" :
                result = num1 - num2;
                break;

            case "*" :
            case "x":
                result = num1 * num2;
                break;

            case "/" :
                result = num1 / num2;
                break;

            case "%" :
                result = num1 % num2;

            default:
                System.out.println(operator + " is an invalid operator");
                isValid = false;
        }

        if(isValid) {


            System.out.println(num1 + operator + num2 + " " + result);

        }


    }


}
