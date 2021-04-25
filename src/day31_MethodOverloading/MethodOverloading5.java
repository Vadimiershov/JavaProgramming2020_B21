package day31_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading5 {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 2.5, 3.5};
        double[] arr2 = {4.5, 5.5, 6.5};
        double[] arr3 = {7.5, 8.5, 9.5};
        double[] arr4 = {10.5, 11.5, 12.5, 13.5};

        double[] arr5 = combine2Arr(combine2Arr(arr1, arr2), combine2Arr(arr3, arr4));
        System.out.println(Arrays.toString(arr5));


        String[] group1 = {"Maryam", "Hurshid", "Duane", "Halisa", "Alimu"};
        String[] group2 = {"Halzat", "Aziz", "Abdujilil", "Polina", "Aisha"};
        String[] group3 = {"Asel", "Rauf", "Ibrahim", "Erhan", "Halil", "Hanieh", "Ruzanna", "Jiamila", "Jimell", "Sofia", "Yilihamu", "Nueraihemaiti"};
        ;
        String[] group4 = {"Livio", "Steph", "Dan", "Sobir", "Atala", "Yusef", "Saafir"};
        String[] group5 = {"Sevara", "Saltanat", "Volkan", "Muhammad", "Angelina", "Ayah",
                "Slobodan", "Zahar", "Serdar", "Diana"};

        String[] group1and2 = combine2Arr(group1, group2);
        String[] group3and4 = combine2Arr(group3, group4);

        String[] cybertek = combine2Arr(combine2Arr(group1and2, group3and4), group5);
        String[] cybertek1 = combine2Arr( combine2Arr( combine2Arr(group1,group2), combine2Arr(group3,group4)),group5);

        System.out.println(Arrays.toString(cybertek));
        System.out.println(Arrays.toString(cybertek1));

    }


    public static double[] combine2Arr(double[]arr1,double[]arr2){

        double [] combine = new double[arr1.length+arr2.length];
        int pos = 0;
        for (double eacharr1:arr1)
            combine[pos++] = eacharr1;

        for (double eachchar2: arr2)
            combine[pos++] = eachchar2;
        return combine;
    }

    public static String[] combine2Arr(String[]arr1,String[]arr2){

        String [] combine = new String[arr1.length+arr2.length];
        int pos = 0;
        for (String eacharr1:arr1)
            combine[pos++] = eacharr1;

        for (String eachchar2: arr2)
            combine[pos++] = eachchar2;
        return combine;
    }


}
