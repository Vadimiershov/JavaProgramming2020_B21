package day14_Switch_Recap;

public class IfStatementWithOutCurlyBraces {

    public static void main(String[] args) {

        int a = 10;

        if (a % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        // without the { }, blocks can contain one statement only

        int b = 10;

        if (b > 0) System.out.println("Positive");
        else if (b < 0) System.out.println("Negative");
        else System.out.println("Zero");

        System.out.println("========================================================================================");

        int number = 5;
        String day = "";

        if (number >= 1 && number <= 7)

            if (number == 1)
                day = "Monday";
            else if (number == 2)
                day = "Tueday";
            else if (number == 3)
                day = "Wednesday";
            else if (number == 4)
                day = "Thursday";
            else if (number == 5)
                day = "Friday";
            else if (number == 6)
                day = "Saturday";
            else
                day = "Sunday";

        else
            day = "Invalid";


    }


}
