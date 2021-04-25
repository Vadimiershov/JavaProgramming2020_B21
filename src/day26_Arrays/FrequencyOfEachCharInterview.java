package day26_Arrays;

public class FrequencyOfEachCharInterview {

    public static void main(String[] args) {

        String str = "aaabbc"; //"a3b2c1"
        // a b c
        // Step1: remove duplicates
        String nonDup = "";  // "abc"
        for (int i = 0; i < str.length(); i++) {
            String eachChar = "" + str.charAt(i); // a, a, a, b, b, c
            if (!nonDup.contains(eachChar)) {
                nonDup += eachChar;
            }

        }
        System.out.println(nonDup);

        String result = ""; //a3b2c1
        // Step2:frequency of each non duplicated characters
        for (int j = 0; j <= nonDup.length() - 1; j++) { //j is the index num of nonDup
            char ch = nonDup.charAt(j); //a
            int count = 0;  // to contain the frequency of char ch
            for (int i = 0; i <= str.length() - 1; i++) {
                char eachChar = str.charAt(i); //a, b, c
                if (ch == eachChar) {
                    count++;
                }

            }
            result += "" + ch + count;

        }

        System.out.println(result);
    }

}
/*
1. write a program that can return the frequency of characters from a String
            Ex:
                str = "ababaac";
                output:
                    a3b2c1

 */