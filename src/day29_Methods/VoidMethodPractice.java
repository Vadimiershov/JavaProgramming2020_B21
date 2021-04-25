package day29_Methods;

import java.util.Arrays;

/*
AM specifier    returnType    methodName    (Parameter)
 */
public class VoidMethodPractice {

    public static void main(String[] args) {

        int[] a1 = {23,45,56,67,9,89,5,23,68,89};

        arrayMaxNum(a1);
        arrayMinNum(a1);

        int[] a2 = {23,456,76,23,234,56567,7,6767,8678};

        arrayMinNum(a2);

        int[] a3 = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8};

        arrayUniqueElements(a3);

    }

    public static void arrayMaxNum(int[] arr){
        int max = arr[0];
        for (int each: arr)
            if(max < each)
                max = each;
            System.out.println("Maximum number: "+max);
    }

    public static void arrayMinNum(int[] arr){
        int min = arr[0];
        for (int each: arr)
            if(min > each)
                min = each;
            System.out.println("Minimum number: "+min);
    }

    public static void arrayUniqueElements (int[] arr){

        for (int each: arr) {
            int count = 0;

            for (int each2:arr) {
                if (each == each2)
                    count++;
            }
        if(count == 1)
            System.out.println(each);
        }
        System.out.println();
    }




}
