package day15_Scanner;

import java.util.Scanner;

public class Even_Or_Add {

    public static void main(String[] args) {

        System.out.println("Please enter your number: ");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        String result = "";

        if(number%2==0){
            result = " is Even";
        }else {
            result = " is Add";
        }

        System.out.println(number+result);



    }


}
