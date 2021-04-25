package day26_Arrays;

import java.util.Scanner;

public class FindAverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int length = scan.nextInt();
        int [] numbers = new int [length];
        int sum =0;

        for(int i=0;i<length;i++){
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];

        }

        double average = (double)sum / length;

        System.out.println(average);



    }


}
