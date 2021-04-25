package day26_Arrays;

import java.util.Arrays;

public class ArraysDescending {

    public static void main(String[] args) {

        int[] arr = {5,2,6,8,9};

        Arrays.sort(arr);
        int[]descending = new int[arr.length]; //[7, 6, 5, 2, 1, 0]


        for(int i=arr.length-1,j = 0; i>=0;i--,j++){
            //System.out.println(arr[i]+"");
            descending[j] = arr[i];

        }
        System.out.println(Arrays.toString(descending) );

    }


}
