import java.util.Scanner;

public class Travel_TAsk {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid password?");
        String validPassword = input.next();

        boolean valid = (validPassword.equalsIgnoreCase("yes"));
        int baseCost = 1000;
        int costwithBags = 0;
        int bagscost = 0;
        int costAmount = 0;

        if (valid) {

            System.out.println("What country are you travel to?");
            input.nextLine();
            String country = input.nextLine();

            System.out.println("How many bags will you take with you?");
            int bags = input.nextInt();
            bagscost = bags * 50;
            costwithBags = baseCost + (bags * 50);

            System.out.println("How many people will travel with you?");
            int people = input.nextInt();

             if (people<4){

                 costAmount = costwithBags - (people*100);
             }else {
                 costAmount = costwithBags;
             }
            System.out.println("Enter the names of the people who will travel with you, separated by comma ");
            input.nextLine();
            String names = input.nextLine();
            System.out.println("Your ticket is booked to " + country+". We have charged extra for the "
            +bagscost+" bags but you are traveling with "+names+" so we are giving a discount. Your " +
                    "total cost is "+costAmount);




        }else{
            System.out.println("Looks like your password has been expired for years, but not worry we will get" +
                    "it ready for you to travel to all countries. Your total cost has come out to costAmount");

        baseCost = 200;


        }


    }


}
