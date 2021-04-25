package day52_Collection;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        //List (I): has index numbers, accepts duplicates objects

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,10,11,12));
        list1.removeIf(p-> p <5);

        System.out.println(list1.get(4));

        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        list2.removeIf(p-> p<5);  //faster than ArrayLIst;
        //doublly linked -> performing faster;
        System.out.println(list2.get(4)); // faster
        System.out.println(list2);

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        list3.removeIf(p-> p<5);
        System.out.println(list3.get(4));//thread-safe, synchronized

        Stack<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(15,25,35,45));
        list4.pop();  // remove 45
        System.out.println(list4);


        System.out.println("=========================================================================");

        Stack<String> names = new Stack<>();
        names.addAll(Arrays.asList("Aysel","Amir","Mohammed","Bursa","Necdat","Break"));

        String last = names.pop();
        System.out.println(last);

    }

    public synchronized void method1(){

    }

    public void method2(){

    }


}
