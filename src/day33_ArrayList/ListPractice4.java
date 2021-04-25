package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(70);

        int n1 = list.indexOf(30);
        int n2 = list.lastIndexOf(10);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println(list.contains(60));
        System.out.println("============================================================================================");

        ArrayList<Character>  characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');

        ArrayList<Character> nonDup = new ArrayList<>();

        for (char each:characters) {
            if(!nonDup.contains(each))
            nonDup.add(each);
        }

        System.out.println(characters);
        System.out.println(nonDup);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);

        System.out.println(list1 == list2 );
        System.out.println(list1.equals(list2));

    }


}
