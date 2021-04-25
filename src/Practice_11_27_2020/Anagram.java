package Practice_11_27_2020;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        System.out.println(sort("zxyb"));
        str1 = sort(str1);
        str2 = sort(str2);

        System.out.println(str1.equals(str2));

        System.out.println("=========================================================================================");

        String s1 = "Listen";
        String s2 = "Silent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        String[] arr1 = s1.split("");
        String[]arr2 = s2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);

    }

    public static String sort(String str){
        String result = "";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for(char each: ch)
            result +=each;
        return result;
    }



}
