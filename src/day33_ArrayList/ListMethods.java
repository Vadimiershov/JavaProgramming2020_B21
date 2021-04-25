package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        list1.add(100);

        list1.set(1,400);

        System.out.println(list1);


        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Suveyda");
        names.add("Egemena");


        System.out.println(names);

        names.set(3,"Afrooz");
        names.set(5,"Fiona");
        System.out.println(names);

        int[] arr = {10,20,30,40};
        arr[1] = 200;

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        //remove(object)
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');


        Character ch  = 'C';

        boolean r1 = list2.remove(Character.valueOf('C'));

        System.out.println(list2);
        System.out.println(r1);


    }


}
