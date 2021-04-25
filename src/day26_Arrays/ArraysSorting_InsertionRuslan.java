package day26_Arrays;

import java.util.Arrays;

public class ArraysSorting_InsertionRuslan {

    public static void main(String[] args) {

        int[] arr = { 6,2,4,8,3 };

        for ( int i = 1; i < arr.length; i++ ) {

            int temp = arr[i];
            int j = i-1;
            while ( j >= 0 && temp < arr[j] ) {
                arr[j+1] = arr[j--]; // we can remove -- from this line and uncomment line 17 for the same result
                //j--;
            }
            arr[j+1] = temp;
            // use line 21 to observe the result of each iteration of the for loop
            //System.out.println("Steps #" + i + " " + Arrays.toString(arr));
        }
        System.out.println("Sorted arr " + Arrays.toString(arr));
    }





}
