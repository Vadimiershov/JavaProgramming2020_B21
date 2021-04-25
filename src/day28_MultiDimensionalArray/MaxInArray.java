package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MaxInArray {

    public static void main(String[] args) {

        int [][] arr = {{1,5,4,2,6,7},{4,7,3,10}};
int max = 0;
        for (int[] eacharr: arr) {
            for (int eachnum: eacharr) {
              if(max<eachnum){
                  max=eachnum;
              }
            }

        }

        System.out.println(max);
    }


}
