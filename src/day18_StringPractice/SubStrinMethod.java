package day18_StringPractice;

import java.util.Scanner;

public class SubStrinMethod {

    public static void main(String[] args) {
        
        String str = "today is Monday";
        
        String day = str.substring(9,14+1);
        System.out.println("day = " + day);
        
        String email = "vadimiersgov@gmail.com";
        String domain = email.substring(12,21+1);
        System.out.println("domain = " + domain);
        
        String s1 = "I like movies and books";
        
        String word1 = s1.substring(7,12+1);

        System.out.println("word1 = " + word1);

        String firstNAme = "mArWan";

        String firstChar = firstNAme.substring(0,1).toUpperCase();
        System.out.println(firstChar);
        String rest = firstNAme.substring(1, firstNAme.length()-1+1).toLowerCase();
        System.out.println(rest);
        firstNAme = firstChar + rest;
        System.out.println(firstNAme);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.next();
        name = name.substring(0,1).toUpperCase()+name.substring(1,name.length()-1+1).toLowerCase();
        System.out.println("Enter your last name");
        String last = input.next();
        last = last.substring(0,1).toUpperCase() + last.substring(1,last.length()-1+1).toLowerCase();
        System.out.println(name+" " + last);

        
        
    }
    
    
}
