package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println( numbers );  //hashcode

        System.out.println( Arrays.toString(numbers));

        String[] classMates = {"Adil","Zuhra","Zulifya","Maya","Daniel"};

        System.out.println(Arrays.toString(classMates).replace("[","{").replace("]","}"));
        //sort array

        int[] arr1 = {1,5,2,7,5,3};
        Arrays.sort(arr1); // does not return any value, cannot be assigned to a variable
        System.out.println( Arrays.toString(arr1) );
        System.out.println("Max " +arr1[arr1.length-1]);
        System.out.println("min "+arr1[arr1.length-1]);
        System.out.println("second min number: "+arr1[1]);


        String[] names = {"Haroon","Nurahmet","Livio","Dean","Ayah"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


    }




}
