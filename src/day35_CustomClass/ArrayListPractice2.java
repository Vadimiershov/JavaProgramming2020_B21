package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        String [] jobTitles = {"SDET", "Scrum Master", "QA", "Developer", "PO", "SDET", "QA"};

        ArrayList<String> jobs = new ArrayList<>();
        jobs.addAll(Arrays.asList(jobTitles));

        jobs.retainAll( Arrays.asList( "SDET", "QA"));
        System.out.println(jobs);
        jobs.removeIf( p-> !p.equals( "SDET") && !p.equals("QA"));
        System.out.println(jobs);
        System.out.println("=======================================================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,43,5,6,3,4,55,5,5,45,6,65,43,65,23,9,6,8,7,78,8,56,34,2,3,2,3,44,5,6,6));

        numbers.retainAll(Arrays.asList(7,8,9));
        System.out.println(numbers);
        System.out.println("=========================================================================================");


        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,43,5,6,3,4,55,5,5,45,6,65,43,65,23,9,6,8,7,78,8,56,34,2,3,2,3,44,5,6,6));
//remove the elements that are less than 7

        numbers2.removeIf( p-> p<7);

        System.out.println("=========================================================================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,100,200,300,400,500,600,700,800));

        list.removeIf(p -> p> 100);

        System.out.println(list);

        ArrayList<Integer> temp = new ArrayList<>();
        for( int each: list){
            if(each <=100){
                temp.add(each);
            }
        }

        list = temp;

        System.out.println(list);


    }



}
