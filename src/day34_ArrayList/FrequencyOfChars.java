package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "AAABBBCDDDEEE";
        //A3B3C1D3E3
        String result = "";
        ArrayList<String> list = new ArrayList<>();
        for (String each:str.split("")) list.add(each);

        for (String each: list) {
        int frequency = Collections.frequency(list,each);
        if(!result.contains(each))
        result+=each + frequency;
        }
        System.out.println(result);


    }



}
