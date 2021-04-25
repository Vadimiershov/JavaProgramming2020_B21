package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(list1.isEmpty());

        int lastIndex = list1.size()-1;
        int n1 = list1.get(lastIndex);
        System.out.println(n1);

        list1.set(3,400);





    }



}
