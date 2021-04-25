package day30_Methods;

import library.StringUtility;

public class MethodCalls {

    public static void main(String[] args) {

        String str = "Level";

        String reverse = StringUtility.reverseStr1(str);

        System.out.println(str.equalsIgnoreCase(reverse));

        String str2 = "aaaaaaaaaaaabbbbbbbbbccccccccccccccddddddddeeeeeee";

        String result2 = StringUtility.removeDuplicates(str2);

        System.out.println(result2);

        String str3 = "aabcccdeeee";

        String result3 = StringUtility.unique(str3);
        System.out.println(result3);

        String s1 = "ccccccccccccbbbbbbbbbbdbbaaaaaaaaaa";
        String s2 = "bbbbbbbbbbbaaaaaaaaaaacccccc";

        boolean r1 = StringUtility.anagram(s1,s2);
        System.out.println(r1);

    }


}
