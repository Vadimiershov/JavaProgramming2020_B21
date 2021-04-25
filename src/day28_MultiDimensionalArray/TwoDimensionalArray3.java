package day28_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArray3 {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 21, 23}};

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int each: arr2D[i]) {
                System.out.print(each+" ");
            }
            System.out.println();
        }
        System.out.println("==============================================================================");

        for (int[] eachArray : arr2D) {

            for (int i=eachArray.length-1; i>=0;i--){
                System.out.print(eachArray[i]+" ");
            }
            System.out.println();
        }

    }


}
