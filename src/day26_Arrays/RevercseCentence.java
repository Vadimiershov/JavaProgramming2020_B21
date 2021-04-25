package day26_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RevercseCentence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence = scan.nextLine();
        String reverseSentence ="";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i=words.length-1;i>=0;i--){
           reverseSentence += words[i]+" ";
        }
        reverseSentence = reverseSentence.trim();
        System.out.println(reverseSentence);


    }


}
