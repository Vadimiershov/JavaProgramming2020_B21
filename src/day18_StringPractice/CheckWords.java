package day18_StringPractice;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String w1 = scan.next();

        System.out.println("Enter second word");
        String w2 = scan.next();

        System.out.println("Enter third word");
        String w3 = scan.next();

        int l1 = w1.length();
        int l2 = w2.length();
        int l3 = w3.length();

        if(l1 == l2 && l1 == l3){
            System.out.println("All words are same length");

        }else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("Not same nor different length");
        }else{
            System.out.println("All different length");
        }



    }


}
