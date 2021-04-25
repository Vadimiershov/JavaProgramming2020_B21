package day18_StringPractice;

import java.util.Scanner;

public class StringPractice6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        System.out.println((word.endsWith("ly"))?"really":"Never mind");



    }


}
