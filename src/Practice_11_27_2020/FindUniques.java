package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUniques {

    public static void main(String[] args) {

        String[] arr = {"a", "b", "a", "b", "c"};
        String[] result1 = uniques(arr);
        System.out.println(Arrays.toString(result1));

        ArrayList<String> uniqueElementsList = new ArrayList<>();

        for (String element : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(element)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueElementsList.add(element);
            }
        }

        String[] uniques = new String[uniqueElementsList.size()];
        for (int i = 0; i <= uniques.length - 1; i++) {
            uniques[i] = uniqueElementsList.get(i); //each element of the array list need to be assigned
        }

    }

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
