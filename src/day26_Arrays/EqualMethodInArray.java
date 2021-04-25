package day26_Arrays;

import java.util.Arrays;

public class EqualMethodInArray {
    public static void main(String[] args) {

        int [] a1 = {1,2,3};
        int[] a2 = {1,2,3};

        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);
    }
}
