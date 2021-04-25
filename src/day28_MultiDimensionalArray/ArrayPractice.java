package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        /*String []testers = {"Dorin","Adil","Fatih"};
        String []developers = {"Kastrinsi","Mustafa","Ruslan",};
        String []scrumMaster = {"Galyna"};
        String []PO = {"Vadym"};
        String []BA = {"Agalar"};*/
        String [][]ScrumTeam = {
                {"Dorin","Adil","Fatih"},
                {"Kastrinsi","Mustafa","Ruslan"},
        {"Galyna"},
        {"Vadym"},
        {"Agalar"}
            };
        System.out.println(Arrays.deepToString(ScrumTeam));
        for (int i=0; i<= ScrumTeam.length-1; i++){
            System.out.println(Arrays.toString(ScrumTeam[i]));
            for (int j = 0; j <=ScrumTeam[i].length-1; j++) {
                System.out.println(ScrumTeam[i][j]);
            }
        }

    }


}
