package day29_Methods;

import java.util.Scanner;

public class voidMedhodPracticeCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        calculator(scan.nextDouble(),scan.next().charAt(0),scan.nextDouble());
    }


    public static void calculator(double n1, char operator, double n2){

        boolean isValid =operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%';
            if(isValid) {
                switch (operator){
                    case '+':
                        System.out.println("Addition: "+(n1+n2));
                    break;

                    case '-':
                        System.out.println("Subtraction: "+(n1-n2));
                        break;

                    case '*':
                        System.out.println("Multiplication: "+(n1*n2));
                        break;

                    case '/':
                        System.out.println("Division: "+(n1/n2));
                        break;

                    default:
                        System.out.println("Remainder: "+(n1%n2));
                        break;
                }


            } else {
                System.out.println("Operator is not valid");
            }
    }

}
