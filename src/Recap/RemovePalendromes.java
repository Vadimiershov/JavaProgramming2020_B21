package Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalendromes {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("Level", "Car", "Anna", "Nalan"," Java"));

        //words.removeIf(p-> isPalindrome(p));

        for(Iterator<String> it = words.iterator(); it.hasNext();)

            if(isPalindrome(it.next())){
                it.remove();
            }

        System.out.println(words);
    }

    public static boolean isPalindrome(String str){
        //return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse.equalsIgnoreCase(str);


    }



}
