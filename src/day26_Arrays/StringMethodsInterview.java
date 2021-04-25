package day26_Arrays;

import java.util.Arrays;

public class StringMethodsInterview {

    public static void main(String[] args) {

        String str = "abcde";

        char [] array = str.toCharArray();

        System.out.println(Arrays.toString(array));
        System.out.println("=======================================================");
        //Anagram task
        String s1 ="acb"; //a,c,b
        String s2 = "bac";//b,a,c

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println( Arrays.toString(ch1));
        System.out.println( Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println(isAnagram);

        //Split method

        String sentence = "Today is great day";
        String[] word = sentence.split(" ");
        int words = word.length;
        System.out.println( Arrays.toString(word) );
        System.out.println(words);




    }


}
