package day21_While_DoWhile;

import java.util.Scanner;

public class CharReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");

        String word = scan.nextLine();
        String reversedWord = "";
        int lastIndex = word.length()-1;


        for (int i = lastIndex; i>=0; i--){
            reversedWord += word.charAt(i);

        }
        System.out.println(reversedWord);
        boolean isPalendrome = word.equals(reversedWord);
        System.out.println(isPalendrome);



    }



}
