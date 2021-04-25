package day26_Arrays;

import java.util.Arrays;

public class ArraysSorting_InsertionPavel {

    public static void main(String[] args) {

//     5 ,8 , 1, 5
//        i = [0]
//          0  1  2  3
//          5, 8, 1, 5
//                  5, 8, 5, 5
//                          0 1 2 3
//                          1,8,5,5
//                          i = [1]
//                          1,8,5,5
//                                  1,5,8,5
//                                          i = [2]
//                                          0 1 2 3
//                                          1,5,8,5
        // 1,5,5,8
        int[] array = {1,5,3,2};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
