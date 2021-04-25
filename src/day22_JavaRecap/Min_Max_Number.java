package day22_JavaRecap;

import java.util.Scanner;

public class Min_Max_Number {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483647;

        for(int i=1; i<=5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
            if (n < min) {
                min = n;
            }

            if( n > max){
                max = n;
            }



        }
        scan.close();
        System.out.println("Min = "+min +"\n"+ "Max = "+max);



    }



}
