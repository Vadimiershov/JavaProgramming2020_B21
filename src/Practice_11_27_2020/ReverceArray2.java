package Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverceArray2 {

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,5};

        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = arr.length-1; i >=0; i--){
            reverseList.add(arr[i]);
        }



    }



}
