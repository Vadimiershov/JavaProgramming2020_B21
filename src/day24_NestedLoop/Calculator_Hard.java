package day24_NestedLoop;

import java.util.Scanner;

public class Calculator_Hard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result = 0;

        while (true){
            System.out.println("Enter a number");
            int num1 = scan.nextInt();

            System.out.println("Enter a number");
            int num2 = scan.nextInt();

            result = num1 + num2;
            System.out.println("result: "+result);

            scan.nextLine();
            System.out.println("Would you like to continue");
            String a = scan.nextLine().toLowerCase();

            while( !(a.equals("yes")||a.equals("no")) ){
                System.out.println("Invalid entry, Please Re-Enter");
                System.out.println("Would you like to continue?");
                a = scan.nextLine().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }



        }


    }



}
