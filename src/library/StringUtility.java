package library;

import java.util.Arrays;

public class StringUtility {

    public static String reverseStr1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

    public static int frequency(String str, char ch) {
        int count = 0;

        for (char eachchar : str.toCharArray()) {
            if (eachchar == ch)
                count++;
        }
        return count;
    }

    public static String unique(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = frequency(str, each);
            if (count == 1)
                unique += each;
        }
        return unique;
    }

    public static String removeDuplicates(String str) {

        String result = "";
        for (String each : str.split("")) {
            if (!result.contains(each))
                result += each;
        }

        return result;
    }

    public static String frequencyOfCharacters(String str) {
        String result = "";

        String nonDup = StringUtility.removeDuplicates(str);

        for (int i = 0; i <= nonDup.length() - 1; i++) {

            char ch = nonDup.charAt(i);

            int count = StringUtility.frequency(str, ch);

            result += "" + ch + count;
        }
        return result;
    }

    public static boolean anagram(String str1, String str2){

                str1 = removeDuplicates(str1);
                str2 = removeDuplicates(str2);

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1,ch2);
    }

    public static boolean isPalendrome(String str){
        return reverseStr1(str).equalsIgnoreCase(str);
    }

    public static int frequencyOfWord(String sentence,String word){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int frequency = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }

}
