package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPracticeForEachLoop {

    public static void main(String[] args) {

        String [][]ScrumTeam = {
                {"Dorin","Adil","Fatih"},
                {"Kastrinsi","Mustafa","Ruslan"},
                {"Galyna"},
                {"Vadym"},
                {"Agalar"}
        };

        for (String[] eachGroup:ScrumTeam) {
           // System.out.println(Arrays.toString(eachGroup));
            for (String eachName:eachGroup) {
                System.out.println(eachName);
            }
        }


    }


}
