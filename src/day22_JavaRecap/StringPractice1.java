package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        String sentence = "My name is Muhtar";

        String name1 = sentence.substring(5);

        System.out.println(name1);

        String str1 = "Monday is cool, it's a fun day";

        String day1 = str1.substring(0,str1.indexOf(" "));
        System.out.println(day1);

        String s1 = "https://www.amazon.com";
        String domain = s1.substring(s1.lastIndexOf(".")+1);
        System.out.println(domain);

        String name = s1.substring(s1.indexOf(".")+1,s1.lastIndexOf("."));
        System.out.println(name);

        name = name.substring(0,1).toUpperCase()+name.substring(1);
        System.out.println(name);

        System.out.println("============================================================================");

        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine().toLowerCase().replaceFirst(" ","");
        String lastName = scan.nextLine().toLowerCase().replace(" ","");
        scan.close();

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String fullName = firstName+" "+ lastName;

        System.out.println(fullName);



    }


}
/*
substring: creates substring from string
     substring(beg, end) :creates substring from beggining index till the given index;
     substring(beg): creates substring from beginning index;
 */