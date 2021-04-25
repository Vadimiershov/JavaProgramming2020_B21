package day16_Scanner;

import java.util.Scanner;

public class Scanner_Info {

    public static void main(String[] args) {

        System.out.println("Please enter your first name: ");

        Scanner input = new Scanner(System.in);

        String firstName = input.next();

        System.out.println("Please enter your last name:");
        String lastName = input.next();

        System.out.println("Are you employed? True or False");
        boolean employed = input.nextBoolean();

        double salary = 0;

        if(employed) {
            System.out.println("What is your salary?");
            salary = input.nextDouble();
        }
        System.out.println("Full name is: "+ firstName+" "+lastName);
        System.out.println("Employed "+ employed);
        System.out.println("Salary: "+salary);


    }


}
