package Recap;

import java.util.*;

public class moveAllZerosToEnd {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3,0,3,1,5,3,6,7,0,2,0));

//        int totalZeros = Collections.frequency(list,0);
//
//        list.removeAll(Arrays.asList(0));
//
//        for (int i = 0; i < totalZeros; i++) {
//            list.add(0);
//        }

        int originalSize = list.size();

        list.removeAll(Arrays.asList(0));

        int newSize = list.size();

        int totalNumOfZeros = originalSize - newSize;
        for (int i = 0; i < totalNumOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("========================================================================");

        int[] array = {3,0,10,2,3,0,4};

        int[] newArray = new int[array.length];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                newArray[count] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newArray));


    }

    


}
