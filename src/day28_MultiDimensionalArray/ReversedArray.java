package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        String [] []batch21 = { {"lily","lana","igor"} ,
                {"Polina","Sergii","Aziz","Halzat"} ,
                {"Adil","Irina","Med", "Vlad"} };

        for (int i = batch21.length-1; i >=0; i--) {
            for (int j= batch21[i].length-1;j>=0;j--){
                System.out.print(batch21[i][j]+" ");
            }

        }
    }



}
