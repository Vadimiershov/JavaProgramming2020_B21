package day31_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading4 {

    public static void main(String[] args) {

        String []arr = {"asd","ghf","sfdg","Fsfs"};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static String[] sort(String[]arr){

        Arrays.sort(arr);
        String [] revercedArr = new String[arr.length];
        for (int i=arr.length-1,j=0;i>=0;j++,i--) {
            revercedArr[j]=arr[i];
        }
        return revercedArr;
    }



}

/*
sort:
     double[]
     int[]
     char[]
     String[]
 */