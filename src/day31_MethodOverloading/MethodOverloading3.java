package day31_MethodOverloading;

public class MethodOverloading3 {

    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (max < each)
                max = each;
        }

        return max;
    }

    public static double max(double[] arr){
        double max = arr[0];

        for (double each : arr) {
            if (max < each)
                max = each;
        }

        return max;

    }

    public static double min(double[] arr) {
        double min = arr[0];
        for (double each : arr)
            if (min > each)
                min = each;


        return min;
    }


}
