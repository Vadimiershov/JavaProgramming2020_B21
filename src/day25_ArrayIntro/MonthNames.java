package day25_ArrayIntro;

import java.util.Arrays;
import java.util.Scanner;

public class MonthNames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("Enter the number:");
        int num = scan.nextInt();

        System.out.println(month[num]);

        int [] Number = {1,2,3,4,5,6,7,7,8,9};
        System.out.println(Arrays.toString(Number));




    }



}
