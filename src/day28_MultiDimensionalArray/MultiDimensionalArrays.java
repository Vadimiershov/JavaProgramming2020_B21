package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
                    //0 1

        int[] arr2 = {3,4,5,6,7};
        //            0 1 2 3 4
        int[] arr3 = {8,9,20,11,12,13};

        int [][] arrays = {arr1, arr2, arr3 };
        System.out.println(arrays[1][3]);
        System.out.println(arrays[2][0]);
        System.out.println(Arrays.deepToString(arrays));

        System.out.println("=======================================================================");

        String [] []batch21 = { {"lily","lana","igor"} ,
                                {"Polina","Sergii","Aziz","Halzat"} ,
                                {"Adil","Irina","Med", "Vlad"} };
        for(int i=0; i<batch21.length;i++){
           // String[]eachGroup = batch21[i];
            System.out.println(Arrays.toString(batch21));

            for (int j=0;j<batch21[i].length;j++){
                System.out.println(batch21[i][j]);
            }
        }



    }


}
