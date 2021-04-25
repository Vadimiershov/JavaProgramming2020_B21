package day21_While_DoWhile;

import java.util.Scanner;

public class RemoveDuplicatesInterview {

    public static void main(String[] args) {

        String str = "AAABB";
        String result = "";

        for(int i=0;i<=str.length()-1;i++){
            String eachCharacter = ""+str.charAt(i);
            System.out.println(eachCharacter);
            if(result.contains(eachCharacter)){
                continue;
            }else{
                result += eachCharacter;
            }
        }
        System.out.println("result = "+result);




    }



}
/*
write a program that can remove duplicates from the string
 */