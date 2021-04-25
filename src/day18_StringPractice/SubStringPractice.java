package day18_StringPractice;

import java.util.Scanner;

public class SubStringPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two word");
        String word1 = input.nextLine();
        String word2 = input.nextLine();

        String result = word1.substring(1,word1.length())+word2.substring(1,word2.length());
        System.out.println(result);



    }


}
