package day21_While_DoWhile;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word  = scan.nextLine();

        char f = word.charAt(0);
        char l = word.charAt(word.length()-1);
        System.out.println(""+f+l);
        String r1 = "Batch "+2+1;
        System.out.println(r1);

        System.out.println("========================================================================");





    }



}
