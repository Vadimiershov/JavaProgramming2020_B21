package day26_Arrays;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        String sentence = "I love java, java is a cool programming language and java is more useful than javascript";
        String [] arr= sentence.split(" ");
        int countJava = 0;
        int countPython = 0;
        for(int i = 0; i <=arr.length-1;i++){

            if(arr[i].toLowerCase().contains("java")){
                countJava++;
            }
        }
        System.out.println("Java: "+countJava);

    }


}
