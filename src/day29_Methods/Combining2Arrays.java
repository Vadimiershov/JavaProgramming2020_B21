package day29_Methods;

import java.util.Arrays;

public class Combining2Arrays {

    public static void main(String[] args) {

        int[]arr1 = {1,2,3};
        int[]arr2 = {4,5,6};
        addingArray(arr1,arr2);

    }

    public static void addingArray(int[]arr1,int[]arr2){

        int firstLength = arr1.length;
        int secondLength = arr2.length;

        int []result = new int[firstLength+secondLength];
        int pos = 0;
        for (int each:arr1) {
            result[pos]=each;
            pos++;
        }
        for (int each: arr2) {
            result[pos]=each;
            pos++;
        }
        System.out.println(Arrays.toString(result));

    }

}
