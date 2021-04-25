package day31_MethodOverloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        method(10);
method(5.5);

        System.out.println("===============================================================");

        int[]arr1 = {2,3,4};
        Arrays.sort(arr1);
        double[]arr2 = {2.3,4.5,6.5};
        Arrays.sort(arr2);
        char[]arr3 = {'a','s','d'};
        Arrays.sort(arr3);
        String[]arr4 = {"a","s","d","f"};
        Arrays.sort(arr4);
    }

    public static void method(){
        System.out.println("A");
    }

    public static void method(int a){
        System.out.println("B");
    }

    public static void method(String c){
        System.out.println("C");
    }

    public static void method(int a,String b){
        System.out.println("D");
    }

    public static void method(double a){
        System.out.println("E");
    }



}
