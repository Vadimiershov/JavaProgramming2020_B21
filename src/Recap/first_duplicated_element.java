package Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class first_duplicated_element {

    public static void main(String[] args) {

    //1. find the first duplicated element from the list

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4,5,5,6,6,7,7));

        int result = 0;

//        for (Integer each : list) {
//            int frequency = Collections.frequency(list,each);
//
//            if(frequency<2){
//                result = each;
//                break;
//            }
//
//        }

        for (Integer each : list) {

            int frequency = 0;

            for (Integer each2 : list) {

                if(each==each2)
                    frequency++;
            }

            if(frequency>1) {
                result = each;
                break;
            }
        }



        System.out.println(result);



    }



}
