package day20_ForLoop;

import java.util.Scanner;

public class ReverceString {

    public static void main(String[] args) {

        String str = "abcd";

        String result = "";



        for(int i =str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);


    }


}
