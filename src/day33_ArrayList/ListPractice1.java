package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i <= 100; i++){
            if(i%2 == 0){
                even.add(i);
                continue;
            }

            odd.add(i);
        }
        System.out.println(odd);
        System.out.println(even);
        System.out.println("Last odd Number: "+ odd.get(odd.size() -1) );
        System.out.println("Last even Number: "+ even.get(even.size()-1));
        System.out.println("=========================================================================================");

        int [] arr1 = {1,2,3,4,5,6,7};
        int [] arr2 = {1,2,3,4,5,6,7,8};

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int each: arr1) {
            list1.add(each);
        }
        for (int each: arr2) {
            list1.add(each);
        }
        System.out.println(list1);

        int [][] arr2D = {arr1,arr2};

        ArrayList<Integer>list2 = new ArrayList<>();

        for(int[] each1D:arr2D){
            for(int eachElem: each1D){
                list2.add(eachElem);
            }
        }


    }



}
