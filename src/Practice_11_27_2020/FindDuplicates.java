package Practice_11_27_2020;

import java.util.ArrayList;

public class FindDuplicates {

    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','d','r'};

        ArrayList<Character> duplicateList = new ArrayList<>();

        for (char eachCh:chars) {
            int count = 0;
            for (char each : chars) {
                if (each == eachCh)
                    count++;
            }
            if(count != 1 && !duplicateList.contains(eachCh))
                duplicateList.add(eachCh);
        }
        System.out.println(duplicateList);
    }



}
