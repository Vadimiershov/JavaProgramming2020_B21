package Practice_11_27_2020;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};//length = 4;
        //0    1   2   3
        int[] reverse = new int[arr.length];

        for (int i = arr.length-1,j=0; i >=0; i--,j++) {
            reverse[j] = arr[i];
        }

        System.out.println(Arrays.toString(reverse));

        double [] arr2 = {100, 200, 300, 400, 500};
        arr2 = reverse(arr2);

        System.out.println(Arrays.toString(arr2));

    }

    public static int[] reverse (int[] arr){

        int []reverse = new int [arr.length];
        for (int i = arr.length-1,j=0; i >=0; i--,j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] arr){
        double []reverse = new double[arr.length];
        for (int i = arr.length-1,j=0; i >=0; i--,j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] arr){
        String []reverse = new String[arr.length];
        for (int i = arr.length-1,j=0; i >=0; i--,j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

}
