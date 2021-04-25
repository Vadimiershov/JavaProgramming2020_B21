package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        for(int i = 1; i<=10;i--){

            if(i<1){
                break;
            }
            System.out.println("Hello");

        }

        System.out.println("===================================================================");

        Scanner scan = new Scanner(System.in);

        for(int i=0;i==0;) {
            System.out.println("Enter two numbers");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Enter math operator:");
            char operator = scan.next().charAt(0);
            switch (operator){
                case '+':
                    System.out.println("result: "+(n1+n2));
                    break;

                case '-':
                    System.out.println("result: "+(n1-n2));
                    break;

                case '*':
                    System.out.println("result: "+ (n1*n2));
                    break;

                case '/':
                    System.out.println("result: "+(n1/n2));
                    break;

                case '%':
                    System.out.println("result: "+(n1%n2));
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("would you like to continue? Yes, No");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;
            }


        }



    }


}
