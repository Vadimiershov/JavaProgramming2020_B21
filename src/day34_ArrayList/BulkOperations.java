package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        boolean r1 = list.contains(10);

        boolean r2 = list.contains(10)&&list.contains(30)&&list.contains(40);
        System.out.println(r1);
        System.out.println(r2);

        boolean r3 = list.containsAll(Arrays.asList(10,30,50,60));

        ArrayList<String>group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Svetlana");
        group1.add("Aidai");
        group1.add("Ercan");

        boolean r4 = group1.containsAll(Arrays.asList("Ahmed", "Ercan", "Biden"));
        System.out.println(r4);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','d'));
        System.out.println(chars);

        String[] names = {"Mohammad", "Numan", "Abdullah", "Inna", "Imre", "Sinan"};
        ArrayList<String> students = new ArrayList<>(Arrays.asList(names));
        //students.addAll(Arrays.asList(names));
        System.out.println(students);

        ArrayList<Character>ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ch1.addAll(Arrays.asList('J','K','L','M','N'));

        System.out.println(ch1);

        ArrayList<String> group2 = new ArrayList<>();
        group2.addAll(Arrays.asList(names));

        group2.removeAll(Arrays.asList("Inna","Imre","Sinan"));
        System.out.println(group2);

        System.out.println("========================================================================================");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Ahmed", "Ahmed", "Ahmed", "Ahmed", "Adil"));
/*
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).equals("Ahmed")){
                employees.remove(i); //without the interface iterable, remove method cannot b used in loop
            }
        }
        System.out.println(employees);
*/
        //remove all except
        employees.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employees);
        //retain all except
        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmed", "Ahmed", "Ahmed", "Ahmed", "Ahmed", "Adil"));

        employees2.retainAll(Arrays.asList("Adil"));
        System.out.println(employees2);
    }


}
