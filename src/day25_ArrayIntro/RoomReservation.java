package day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        while (true) {
            System.out.println("Which room would you like to select?");
            System.out.println("\t\tA. King Bed == $120");
            System.out.println("\t\tB. Queen Bed == $100");
            System.out.println("\t\tC. Single bed == $80");

            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("king bed") || (word.equals("queen bed") || (word.equals("single bed"))))) {

                System.out.println("Invalid Entry, please Re-Enter");
                word = scan.nextLine().toLowerCase();
            }
            totalPrice += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
                String a = scan.nextLine().toLowerCase();

                while (!(a.equals("yes")||a.equals("no"))){
                    System.out.println("Invalid Entry, please re-enter");
                    System.out.println("Would you like to select another room");
                    a = scan.nextLine().toLowerCase();
                }

                if (a.equals("no")) {
                    System.out.println("Your total price is:"+totalPrice);
                    break;
                }



            }
        }

    }

