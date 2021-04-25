package Office_Hours.Practice_10_28_2020;

import java.util.Scanner;

public class FrequencyOfSingleChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.next();
        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);
        scan.close();

        int frequency = 0;
        for (int i = 0; i<str.length() ; i++) {
            if(ch == str.charAt(i)){
                frequency++;
            }

        }
        System.out.println(frequency);


    }


}
