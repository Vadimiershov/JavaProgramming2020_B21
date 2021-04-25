package Practice_11_27_2020;

import java.text.DecimalFormat;

public class MathPractice {

    public static void main(String[] args) {

       double n1 =  Math.pow(2, 3); // power

        System.out.println(n1);

        int max1 = Math.max(100, 200);
        System.out.println(max1);

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int max = numbers[0];
        int min = numbers[0];

        for (int each:numbers) {
            max = Math.max(each,max);
            min = Math.min(each,min);
        }
        System.out.println(max+" "+min);

        DecimalFormat df = new DecimalFormat("0.00");

        double r1 = calculateAreaOfTheCircle(3);
        System.out.println(df.format(r1));

        double n5 = Math.sqrt(100);
        System.out.println(n5);




    }

        public static double calculateAreaOfTheCircle(double r){
        return Math.PI * Math.pow(r,2);
        }

}
