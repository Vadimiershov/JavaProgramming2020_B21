package day27_ForEachLoop;

import java.util.Scanner;

public class UniqueNumberFromArray {

    public static void main(String[] args) {

        int [] numbers = {4,4,5,5,3,2,2};
        String uniqueInt = "";

        for (int i = 0; i < numbers.length; i++) {
            int eachNum = numbers[i];
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if(eachNum==numbers[j])
                count++;
            }
            if(count==1){
                uniqueInt +=eachNum;
            }
        }
        System.out.println(uniqueInt);


    }



}
