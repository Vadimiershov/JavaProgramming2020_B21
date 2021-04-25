package day30_Methods;

import library.StringUtility;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbcc";
        String result = "";

        String nonDup = StringUtility.removeDuplicates(str);

        for (int i = 0; i <= nonDup.length() - 1; i++) {

            char ch = nonDup.charAt(i);

            int count = StringUtility.frequency(str, ch);

            result += "" + ch + count;

        }
        System.out.println(result);

        String str2 = "aaaaaaaaaggggggggggeeeewlllsdff";
        String result2 = frequencyOfCharacters(str2);
        System.out.println(result2);
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



}
