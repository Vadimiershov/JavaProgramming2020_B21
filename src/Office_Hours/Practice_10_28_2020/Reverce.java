package Office_Hours.Practice_10_28_2020;

import java.util.Scanner;

public class Reverce {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        String result = "";
        for(int i = name.length()-1; i>=0; i--){
            result += name.charAt(i);
        }
        System.out.println(result);
        System.out.println("==================================================================");
        for (int i = name.length()-1; i >=0; i--) {
            result += name.substring(i, i + 1);
        }
        System.out.println(result);



    }




}
