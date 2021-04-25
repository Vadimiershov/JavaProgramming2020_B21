package day26_Arrays;

import java.util.Arrays;

public class UniqueWord {

    public static void main(String[] args) {

        String [] words = {"C#", "Java", "Python", "Python","Swift"};
        String result = "";
        String duplicates = "";

        for (int j = 0; j < words.length; j++) {
            String unique = words[j];
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if (unique.equals(words[i])) {
                    count++;
                }
            }
            if (count == 1) {
                result +=unique+" ";
            }
            if (count>1){
                duplicates +=unique+" ";
            }
        }
        System.out.println(result);
        System.out.println(duplicates);



    }


}
