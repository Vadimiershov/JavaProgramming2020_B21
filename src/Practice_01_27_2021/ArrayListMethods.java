package Practice_01_27_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.addAll(Arrays.asList(20,30,40,50));

        System.out.println(list.size());
        System.out.println(list);

        list.remove(3);



    }



}
