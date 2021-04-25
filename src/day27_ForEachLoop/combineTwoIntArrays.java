package day27_ForEachLoop;

import java.util.Arrays;

public class combineTwoIntArrays {

    public static void main(String[] args) {

        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = {6,7,8};

        int[]arr3 = new int[arr1.length+ arr2.length];
        int j = 0; //represents the index num of 3rd array

        for (int each:
             arr1) {
           arr3[j++] = each;
        }
        for(int each: arr2){
            arr3[j++] = each;
        }

        System.out.println(Arrays.toString(arr3));


    }


}
