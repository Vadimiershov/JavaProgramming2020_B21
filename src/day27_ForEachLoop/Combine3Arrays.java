package day27_ForEachLoop;

import java.util.Arrays;

public class Combine3Arrays {

    public static void main(String[] args) {

        String []group1 = {"Sara","Jessica","Parker","Dragisa","Sladjan"};
        String []group2 = {"Asel","Ruzanna","Amin","Salih","Jessica"};
        String []group3 = {"Abdul","Sacha","Indiana","Max","Payne"};

        //for(int i=0;i<group1.length+1;i+=2){
         //   System.out.println(group1[i]+group1[i+1]);
        //}

        String[]groups = new String[group1.length+ group2.length+ group3.length];
        int index = 0;
        for (String each:
             group1) {
            groups[index++] = each;
        }
        for (String each:
             group2) {
            groups[index++] = each;
        }
        for (String each:
             group3) {
            groups[index++] = each;
        }
        System.out.println(Arrays.toString(groups));
    }


}
