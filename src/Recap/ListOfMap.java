package Recap;

import java.util.*;

public class ListOfMap {

    public static void main(String[] args) {

        String[] namesGroup1 = {"Oliver", "Jack", "Noah", "Breanna", "Shay", "James", "Conor", "Jake", "John"};
        Integer[] salariesGroup1 = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};
        LinkedHashMap<String, Integer> group1 = new LinkedHashMap<>();

        for (int i = 0; i < namesGroup1.length; i++) {
            group1.put(namesGroup1[i], salariesGroup1[i]);
        }

        String[] namesGroup2 = {"Harry", "Callum", "Mason", "Robert", "Keyle", "Isabella", "Mary", "Joe"};
        Integer[] salariesGroup2 = {88000, 94000, 104000, 108000, 98000, 105000, 85000, 100000};
        LinkedHashMap<String, Integer> group2 = new LinkedHashMap<>();

        for (int i = 0; i < namesGroup2.length; i++) {
            group2.put(namesGroup2[i], salariesGroup2[i]);
        }

        String[] namesGroup3 = {"Bethany", "Emily", "Susan", "Smith", "Murphy"};
        Integer[] salariesGroup3 = {125000, 100000, 115000, 95000, 85000};
        LinkedHashMap<String, Integer> group3 = new LinkedHashMap<>();

        for (int i = 0; i < namesGroup3.length; i++) {
            group3.put(namesGroup3[i], salariesGroup3[i]);
        }

        List<Map<String, Integer>> maps = new ArrayList<>();
        maps.addAll(Arrays.asList(group1, group2, group3));

        System.out.println(maps);

        //who has the maximum salary

        int max = Integer.MIN_VALUE;
        String name = "";

        for (Map<String, Integer> eachMap : maps) {
            for (Map.Entry<String, Integer> each : eachMap.entrySet()) {
                if (each.getValue() > max) {
                    max = each.getValue();
                    name = each.getKey();
                }
            }

        }
        System.out.println(name + " :" + max);

        System.out.println("==================================================================");

        int min = Integer.MAX_VALUE;
        String name2 = "";

        for (Map<String, Integer> eachMap : maps) {
            for (Map.Entry<String, Integer> each : eachMap.entrySet()) {
                if (each.getValue() < min) {
                    min = each.getValue();
                    name2 = each.getKey();
                }
            }

        }
        System.out.println(name2 + " :" + min);

        LinkedHashMap<String, Double> taxes = new LinkedHashMap<>();
        LinkedHashMap<String,Double> salariesAfterTax = new LinkedHashMap<>();

        for (Map<String, Integer> eachMap : maps) {
            for (Map.Entry<String, Integer> each : eachMap.entrySet()) {
                if (each.getValue() < min) {
                String names = each.getKey();
                Integer salary = each.getValue();
                double salaryAfterTax = (salary >= 100000) ? salary * 0.68 : salary * 0.75;
                double tax = salary - salaryAfterTax;

                salariesAfterTax.put(names,salaryAfterTax);
                taxes.put(names,tax);

                    System.out.println(names +" : "+ salaryAfterTax);

                }
            }

        }


    }
}
