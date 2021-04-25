package day29_Methods;

import java.util.Arrays;

public class MethodsWithParameter {

    public static void main(String[] args) {

        int age = 35;
        eligibleToBuyAlcohol(age);

        int[]arr = {11,11,3,5,6,2,3,5,6};
        calculateAge(1980,2020);
        maxNumber(arr);
        minNumber(arr);
        uniqueElement(arr);

    }

    public static void eligibleToBuyAlcohol(int age) {

        if(age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Not eligible");
        }



    }

    public static void calculateAge(int birthYear, int currentYear) {
        if (birthYear < currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear));
        }else {
            System.out.println("Invalid Entry");
        }
    }

    public static void maxNumber(int []arr){
        int max = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void minNumber(int []arr){
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);

    }

    public static void uniqueElement(int []arr){
int unique = 0;
        for (int eachelement: arr) {
            for (int unique1: arr) {
                if(eachelement==unique1)
                unique= unique1;
            }

        }
        System.out.println(unique);
    }



}
