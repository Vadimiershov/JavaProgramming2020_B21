package day30_Methods;

public class returnMethod3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int max = max(array);
        System.out.println("max = " + max);
        System.out.println(max > 100);

        int min = min(array);

        System.out.println(min+" "+max);

    }


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


}
