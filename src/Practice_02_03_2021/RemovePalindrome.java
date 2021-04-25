package Practice_02_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        String[] words = {"Level", "Anna","Java","C#", "Python","Anna", "Level"};

        List<String> list = new ArrayList<>(Arrays.asList(words));

        System.out.println(list);

        Iterator<String> it = list.iterator(); // iterated list of string

        while(it.hasNext()){
            String each = it.next();

            String reversed = "";
            for(int i=each.length()-1; i>=0; i--){
                reversed += each.charAt(i);
            }

            if(each.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("===========================================================================================");

        List<String> list2 = new ArrayList<>(Arrays.asList(words));

        List<String> nonPalindroms = new ArrayList<>();
        String reversed = "";
        for(String each: list2) {
            for(int i=each.length()-1; i>=0; i--) {
                reversed += each.charAt(i);
            }
            if(reversed.equalsIgnoreCase(each)){
                continue;
            }
            nonPalindroms.add(each);

        }
        System.out.println(nonPalindroms);

    }


}
