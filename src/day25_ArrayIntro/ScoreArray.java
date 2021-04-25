package day25_ArrayIntro;

public class ScoreArray {

    public static void main(String[] args) {

        String [] names = {"Azad","Ayse","Inna","Erjon","Aysel", "Aliya", "Marvan", "Zuhra", "Zalfiya"};
        String str1 = names[0];

        System.out.println(names[2]+str1);

        int[] score = {80,85,90,70,75,65,78,87,97};


        System.out.println(names[3]+" : "+score[3]);

        for(int i=0; i <names.length; i++){
            System.out.println(names[i]+" "+ score[i]);
        }





    }



}
