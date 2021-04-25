package day52_Collection;

import java.util.*;

public class SetPractice {

    static String str3;

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.addAll(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));
        System.out.println(names);

        Set<String> names1 = new LinkedHashSet<>();
        names1.addAll(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));
        System.out.println(names1);


        Set<String> names2 = new TreeSet<>();
        names2.addAll(Arrays.asList("Daniel","Ruslan","Adnan","Serhii","Ercan"));
        System.out.println(names2);

        System.out.println("==========================================================");

        String str = "aaaaaaaaaabbbbbbcccccdddddeeeffffgggggggggg";



        LinkedHashSet hs = new LinkedHashSet<>(Arrays.asList(str.split("")));
        System.out.println(hs);

        System.out.println("=======================================================");

        String result = "";
        for(String s : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result+=s;
        }
        System.out.println(result);

        System.out.println("==================================================");

        String result1 = "";
        String[]arr = str.split("");

        System.out.println(Arrays.toString(arr));
        LinkedHashSet<String> hs1 = new LinkedHashSet<>();
        hs1.addAll(Arrays.asList(arr));
        System.out.println(hs1);
        for (String each : hs1) {
            result1 += each;
        }
        System.out.println(result1);

        System.out.println("=============================================================================");

        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        System.out.println(s1);
        String s2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(s1.equals(s2));


    }


}
