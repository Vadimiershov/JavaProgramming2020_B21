package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4}; //[1,2,3,4]



        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            if (list.contains(each))
                continue;

            list.add(each);
        }
        System.out.println(list);

        int[] nonDup = new int[list.size()];
        for (int i = 0; i < nonDup.length; i++) {
            nonDup[i] = list.get(i);
        }
        System.out.println(Arrays.toString(nonDup));

    }

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
}