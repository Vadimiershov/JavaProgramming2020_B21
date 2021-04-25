package day28_MultiDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        /*int[]a = {1,2,3,4};
        int[]b = {5,6,7,8};
        int[]c = {9,10,21,23};
        int[]d = {45,76,34,45};
        int[]e = {32,56,78,89,3};*/
        int[][]arr2D = {{1,2,3,4},{5,6,7,8},{9,10,21,23},{45,76,34,45}};
        char[][]arr3D ={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},
                {' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};;
        System.out.println(Arrays.deepToString(arr3D));
        int max = arr2D[0][0];
        int min = arr2D[0][0];
        for (int i = 0; i<arr2D.length;i++){//i:index numbers of single dimensional array
            int[]arr1D = arr2D[i];
            for(int j=0; j<arr1D.length;j++){//j:numbers of the elements in each array
                int eachelement = arr1D[j];
                if(eachelement>max){
                    max = eachelement;
                }
                if(eachelement<min){
                    min = eachelement;
                }
            }

        }
        System.out.println(max);
        System.out.println(min);

    }


}
