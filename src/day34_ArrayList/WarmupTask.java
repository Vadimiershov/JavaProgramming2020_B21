package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTask {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(1,40);

        numbers.set(numbers.size()-1,0);

        numbers.clear();

        System.out.println(numbers);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i); //unboxing
            if(each%2 != 0){
                numbers.set(i,each*2);
            }
        }
        System.out.println(numbers);

        System.out.println("===========================================================");

        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98};

        ArrayList<Integer> ALIst = new ArrayList<>();
        ArrayList<Integer> BLIst = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for (int each: scores) {
            if(each>=0&&each<=100) {
                if (each >= 90) {
                    ALIst.add(each);
                } else if (each >= 80) {
                    BLIst.add(each);
                } else if (each >= 70) {
                    CList.add(each);
                } else if (each >= 60) {
                    DList.add(each);
                } else {
                    FList.add(each);
                }
            }else
                continue;
            System.out.println(ALIst.size());
            System.out.println(BLIst);
            System.out.println(CList);
            System.out.println(DList);
            System.out.println(FList);
        }



    }



}
/* 1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0];
        2. write a program that can multiply each odd number by 2
        ex: list = [1,2,3,4,5];
        output: [2,2,6,4,10]

 */