package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {

        ArrayList<Integer>nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,6));

        nums.removeIf( p-> Collections.frequency(nums,p) > 1);//== to left duplicated
        System.out.println(nums);

        System.out.println("========================================================================================");

        String str = "aabaacdde";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf( p -> Collections.frequency(list,p)>1);

        System.out.println(list);
        System.out.println("========================================================================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','b','2','c','d','%'));
        chars.removeIf( p -> Character.isDigit(p));
        chars.removeIf(p-> Character.isLetter(p));
        System.out.println(chars);





    }


}
/*
1. write a program that find the unique names from an arraylist of string
                        DO NOT USE:
                                for loop, for each loop, while loop, do while loop

2. write a program that can remove the digits and letters from an array list of characters
                        DO NOT USE:
                                for loop, for each loop, while loop, do while loop

 */