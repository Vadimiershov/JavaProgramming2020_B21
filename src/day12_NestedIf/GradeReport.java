package day12_NestedIf;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {


        int score = 3;
        String grade = "";

        if(score>=0 && score<=100){
            grade = (score>=90) ? "A" :(score>=80) ? "B" :(score>=70) ? "C" :(score>=60) ? "D" : "F";

        }else {
            grade = "Your grade is invalid";
        }
        System.out.println(grade);


    }


}
