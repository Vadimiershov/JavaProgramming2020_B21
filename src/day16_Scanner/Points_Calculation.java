package day16_Scanner;

import java.util.Scanner;

public class Points_Calculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        byte liveWithNumber = input.nextByte();
        input.nextLine();
        int points = 0;

        if(liveWithNumber > 0 && liveWithNumber <=12){
            if (liveWithNumber<=2){
                points++;
            }else if(liveWithNumber>2 && liveWithNumber<=6){
                points +=2;
            }else {
                points +=3;
            }

        }else {
            System.out.println("Not a valid number of people");
        }



        System.out.println("In what city do you live?");
        String city = input.nextLine();

        System.out.println("Do you live in downtown? Yes or no");
        String downtownAnswer = input.next();

        if(downtownAnswer.equals("yes")){
            points += 1;
        }else{
            points -=1;
        }
        System.out.println("What is your favourite animal ? ");
        String animal = input.next();
        System.out.println("How many pets do you want ?");
        int petsWant = input.nextInt();
        System.out.println("What is your social ?");
        int social = input.nextInt();
        input.close();
        System.out.println("You live in "+city);
        System.out.println("Your favourite animal is: "+ animal);
        System.out.println("You want "+petsWant+" pets");
        System.out.println("Your social is: "+social);
        System.out.println("You have "+points+" points");






    }


}
/*
 Count up some points based on the users input:
    Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Ask SSN?
    Print everything and points

 */