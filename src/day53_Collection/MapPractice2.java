package day53_Collection;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {
      /*  1. create a map that can contain student name and student' score
        put 5 of your friends names and thier scores
        print out the names of the students who made less than 80
        2. create a map that can contains name and Date Of Birth.
                put 5 of your classmates' names and thier date of birth
        print out the names of the students who were born before 1980 January 1st
        3. create a map that can contain names of counties and thier capitals
        use for each loop to print out all the capitals
*/

        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Mohammad", 99);
        scores.put("Hoshang", 96);
        scores.put("Javad", 82);
        scores.put("Munir", 64);
        scores.put("Akbar", 74);
        scores.put("Spu", 95);
        scores.put("Simona", 83);
        scores.put("Pedro", 81);

        List<String> earlyBirds = new ArrayList<>(); // >=80
        List<String> angryBirds = new ArrayList<>(); // <=80

        //scores.keySet().forEach(p->{ if(scores.get(p)>=80) earlyBirds.add(p); else angryBirds.add(p);  });

        for(String name : scores.keySet()){
            int score = scores.get(name);
            if(score >= 80){
                earlyBirds.add(name);
            }else {
                angryBirds.add(name);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("===============================================================");

        LinkedHashMap<String, LocalDate> birthDays = new LinkedHashMap<>();
        birthDays.put("Jimmy",LocalDate.now());
        birthDays.put("Farzam",LocalDate.of(2010,2,2));
        birthDays.put("Ramiz",LocalDate.of(2008,5,15));
        birthDays.put("Mariia",LocalDate.of(1976,3,1));
        birthDays.put("Muhtar",LocalDate.of(1969,2,16));

        LocalDate youngest = LocalDate.of(1900,1,1);
        String nameYoung = "";

        LocalDate oldest = LocalDate.now();
        String nameOld = "";

        for (String name : birthDays.keySet()) {
            LocalDate DOB = birthDays.get(name);
            if(DOB.isBefore(LocalDate.of(1980,1,1))){
                System.out.println(name + " : " + DOB);
            }
            if(DOB.isAfter(youngest)){
                youngest = DOB;
                nameYoung = name;
            }
            if(DOB.isBefore(oldest)){
                oldest = DOB;
                nameOld = name;
            }
        }

        System.out.println(nameYoung);
        System.out.println(nameOld);

        System.out.println("==============================================================");

        TreeMap<String, String> counties = new TreeMap<>();
        counties.put("Uited States", "Washington DC");
        counties.put("Russia", "Moscov");
        counties.put("USA", "Washington");
        counties.put("The Czech Republic", "Prague");
        counties.put("Espana", "Madrid");
        counties.put("Brazil", "Brazilia");

        System.out.println(counties);

        counties.values().forEach( p -> {
            System.out.println(p.toUpperCase());
        });

        for (String value : counties.values()) {
            System.out.println(value.toUpperCase());
        }

        System.out.println("===============================================================================");

        // verify:
        boolean r1 = counties.get("Russia").equals("Moscov");
        boolean r2 = counties.containsValue("Moscov");

        //find out the capital of Germany
        System.out.println(counties.get("Brazil"));

        // find out which country capital is Brasilia

        for (String country : counties.keySet()) {
            String capital = counties.get(country);
            if(capital.equals("Brazilia")){
                System.out.println(country);
            }
        }

        System.out.println("===============================================================");

        counties.keySet().forEach(p-> { if(counties.get(p).equals("Washington DC")) System.out.println(p); });

        System.out.println("==============================================================");

        LinkedHashMap<String, Integer> sdets = new LinkedHashMap<>();
        sdets.put("Iryna",80000);
        sdets.put("Emre",95000);
        sdets.put("Apo",100000);

        for (String key : sdets.keySet()) {
            Integer value = sdets.get(key);
            sdets.replace(key, value + 500);
        }
        System.out.println("sdets = " + sdets);

    }
}
