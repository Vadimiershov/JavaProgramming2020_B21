package Practice_11_27_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','A','B','C','A','D','C','A'));

        list.removeAll(Arrays.asList('A'));

        System.out.println(list);

        list.retainAll(Arrays.asList('C'));
        System.out.println(list);



    }



}
