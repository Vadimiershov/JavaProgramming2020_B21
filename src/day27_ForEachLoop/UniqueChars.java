package day27_ForEachLoop;

import java.util.Arrays;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "aabbcddeef";
        char [] arr = str.toCharArray();

        for (int j = 0; j < arr.length; j++) {


            char eachChar = arr[j];
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == eachChar) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(eachChar + "");
            }
        }


    }


}
