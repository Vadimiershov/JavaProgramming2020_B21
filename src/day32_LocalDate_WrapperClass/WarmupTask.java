package day32_LocalDate_WrapperClass;

import java.util.Arrays;

public class WarmupTask {

    public static void main(String[] args) {

       int[]arr = {1,2,3,4,5,6};

       arr = addElement(arr,7);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] addElement(int []arr, int number){

        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result [i] = arr[i];
        }

        result[result.length-1] = number;


        return result;
    }

    public static double[] addElement(double []arr, double number){

        double[] result = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result [i] = arr[i];
        }

        result[result.length-1] = number;


        return result;
    }

    public static char[] addElement(char []arr, char number){

        char[] result = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result [i] = arr[i];
        }

        result[result.length-1] = number;


        return result;
    }

    public static String[] addElement(String []arr, String number){

        String[] result = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result [i] = arr[i];
        }

        result[result.length-1] = number;


        return result;
    }

}
   /* warmup task:
        1. create a return method called addElements that can add an Inteeger  after the  last index of an integer array
        2. create a return method called addElements that can add a double after the last index of a double array
        3. create a return method called addElements that can add a String after the last index of a String array
        4. create a return method called addElements that can add a char after last index of a char array
        Collapse
   */







