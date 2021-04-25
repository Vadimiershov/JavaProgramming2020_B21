package day30_Methods;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,-1,-5,-3,0};
        for (int each: numbers)
            posNegZero(each);

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        combine2Arr(arr1,arr2);
        int[] arr3 = {12,34,56,78};
        int[] arr4 = {54,33,13};
        System.out.println(Arrays.toString(combine2Arr(arr3,arr4)));

        System.out.println(posNegZero(6));

        removeDuplicates("aaccbbw");

        regularFormatPrinting("VADYM","iErshov");

    }

    public static int[] combine2Arr(int[]arr1,int[]arr2){

        int [] combine = new int[arr1.length+arr2.length];
        int pos = 0;
        for (int eacharr1:arr1)
            combine[pos++] = eacharr1;

        for (int eachchar2: arr2)
            combine[pos++] = eachchar2;
        return combine;
    }

    public static String posNegZero(int number){
        String result = (number > 0)?"Positive":(number<0)?"Negative":"Zero";
        return result;
    }

    public static void calculateGrade(int score) {
        if (score >=0 && score <=100)
            System.out.println(   (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F'   );
        else
            System.out.println("Invalid score");
    }

    public static String removeDuplicates(String str){

        String result = "";
        for (String each: str.split("")) {
            if(!result.contains(each))
            result+=each;
        }

        return result;
    }

    public static void regularFormatPrinting(String first,String last){

        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

        String fullName = first +" "+last;
        System.out.println(fullName);
    }




}
