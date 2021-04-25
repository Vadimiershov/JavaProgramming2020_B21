package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many friends do you have?");
        int numbers = scan.nextInt();
        String [] firstName = new String[numbers];
        String [] lastName = new String[numbers];

        for(int i=0; i<numbers;i++) {
            System.out.println("Enter first name:");
            String f = scan.next();
            f = f.substring(0,1).toUpperCase()+f.substring(1).toLowerCase();
            firstName[i] = f;
            System.out.println("Enter last name");
            String l = scan.next();
            l = l.substring(0,1).toUpperCase()+l.substring(1).toLowerCase();
            lastName[i] = l;
        }
        scan.close();

        for(int i = 0; i<numbers; i++){
            System.out.println(firstName[i]+" "+lastName[i]);
        }

    }



}
