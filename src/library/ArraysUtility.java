package library;


import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (max < each)
                max = each;
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int each : arr)
            if (min > each)
                min = each;


        return min;
    }

   /*
   returns max number from double array
    */

    public static double max(double[] arr) {
        double max = arr[0];

        for (double each : arr) {
            if (max < each)
                max = each;
        }

        return max;

    }

    /*
    returns min number from double array
     */

    public static double min(double[] arr) {
        double min = arr[0];
        for (double each : arr)
            if (min > each)
                min = each;


        return min;
    }

    public static int[] combine2Arr(int[] arr1, int[] arr2) {

        int[] combine = new int[arr1.length + arr2.length];
        int pos = 0;
        for (int eacharr1 : arr1)
            combine[pos++] = eacharr1;

        for (int eachchar2 : arr2)
            combine[pos++] = eachchar2;
        return combine;
    }

    /*
    sort integer in descending order
     */

    public static int[] sort(int[] arr) {

        Arrays.sort(arr);
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }

    public static double[] sort(double[] arr) {

        Arrays.sort(arr);
        double[] revercedArr = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {
            revercedArr[j] = arr[i];
        }
        return revercedArr;
    }

    public static char[] sort(char[] arr) {

        Arrays.sort(arr);
        char[] revercedArr = new char[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {
            revercedArr[j] = arr[i];
        }
        return revercedArr;
    }

    public static String[] sort(String[] arr) {

        Arrays.sort(arr);
        String[] revercedArr = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {
            revercedArr[j] = arr[i];
        }
        return revercedArr;
    }

    public static int[] addElement(int[] arr, int number) {

        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        result[result.length - 1] = number;


        return result;
    }

    public static double[] addElement(double[] arr, double number) {

        double[] result = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        result[result.length - 1] = number;


        return result;
    }

    public static char[] addElement(char[] arr, char element) {

        char[] result = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        result[result.length - 1] = element;


        return result;
    }

    public static String[] addElement(String[] arr, String element) {

        String[] result = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        result[result.length - 1] = element;

        return result;
    }

    public static int[] reverse(int[] arr) {

        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] arr) {
        double[] reverse = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] arr) {
        String[] reverse = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

    //removes duplicates from Array of int thru Arraylist

    public static int[] removedDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            if (list.contains(each))
                continue;
            list.add(each);
        }


        int[] nonDup = new int[list.size()];
        for (int i = 0; i < nonDup.length; i++)
            nonDup[i] = list.get(i);

        return nonDup;
    }

    public static double[] removedDuplicates(double[] arr) {
        ArrayList<Double> list = new ArrayList<>();

        for (double each : arr) {
            if (list.contains(each))
                continue;
            list.add(each);
        }


        double[] nonDup = new double[list.size()];
        for (int i = 0; i < nonDup.length; i++)
            nonDup[i] = list.get(i);

        return nonDup;
    }

    public static char[] removedDuplicates(char[] arr) {
        ArrayList<Character> list = new ArrayList<>();

        for (char each : arr) {
            if (list.contains(each))
                continue;
            list.add(each);
        }

        char[] nonDup = new char[list.size()];
        for (int i = 0; i < nonDup.length; i++)
            nonDup[i] = list.get(i);

        return nonDup;
    }

    public static String[] removedDuplicates(String[] arr) {
        ArrayList<String> list = new ArrayList<>();

        for (String each : arr) {
            if (list.contains(each))
                continue;
            list.add(each);
        }

        String[] nonDup = new String[list.size()];
        for (int i = 0; i < nonDup.length; i++)
            nonDup[i] = list.get(i);

        return nonDup;
    }

    //finding unique elements thru Arraylist with Array output

    public static String[] uniques(String[] arr) {
        ArrayList<String> uniqueElementsList = new ArrayList<>();
        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(element))
                    count++;
            }
            if (count == 1)
                uniqueElementsList.add(element);
        }
        String[] uniques = new String[uniqueElementsList.size()];
        for (int i = 0; i <= uniques.length - 1; i++)
            uniques[i] = uniqueElementsList.get(i); //each element of the array list need to be assigned
        return uniques;
    }

    public static int[] uniques(int[] arr) {
        ArrayList<Integer> uniqueElementsList = new ArrayList<>();
        for (int element : arr) {
            int count = 0;
            for (int each : arr) {
                if (each==element)
                    count++;
            }
            if (count == 1)
                uniqueElementsList.add(element);
        }
        int[] uniques = new int[uniqueElementsList.size()];
        for (int i = 0; i <= uniques.length - 1; i++)
            uniques[i] = uniqueElementsList.get(i); //each element of the array list need to be assigned
        return uniques;
    }

    public static double[] uniques(double[] arr) {
        ArrayList<Double> uniqueElementsList = new ArrayList<>();
        for (double element : arr) {
            int count = 0;
            for (double each : arr) {
                if (each==element)
                    count++;
            }
            if (count == 1)
                uniqueElementsList.add(element);
        }
        double[] uniques = new double[uniqueElementsList.size()];
        for (int i = 0; i <= uniques.length - 1; i++)
            uniques[i] = uniqueElementsList.get(i); //each element of the array list need to be assigned
        return uniques;
    }

    public static char[] uniques(char[] arr) {
        ArrayList<Character> uniqueElementsList = new ArrayList<>();
        for (char element : arr) {
            int count = 0;
            for (double each : arr) {
                if (each==element)
                    count++;
            }
            if (count == 1)
                uniqueElementsList.add(element);
        }
        char[] uniques = new char[uniqueElementsList.size()];
        for (int i = 0; i <= uniques.length - 1; i++)
            uniques[i] = uniqueElementsList.get(i); //each element of the array list need to be assigned
        return uniques;
    }


}
