package day16_Scanner;

/*import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your salary:");

        double salary = input.nextDouble();

        System.out.println("How many hours do you work?");

        int hours = input.nextInt();

        double hourRate = (salary / (hours * 52));

        System.out.println("Your hour rate is: " + hourRate );




    }


}
/*
write a program for a rate calculator: RateCalculator
            1. asks the user to enter a salary (double)
            2. asks the user how many hours he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary / (weeklyHour * 52)

 */
import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price");
        String item2 = scan.next();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price");
        String item3 = scan.next();
        double price3 = scan.nextDouble();

        double totoalPrice = price1 + price2 + price3;
        String report = "Item1: "+ item1 + " Price: " + price1 + ",Item2: " + item2 +
                " Price: " + price2 + ",Item3: " + item3 + " Price: " + price3;

        System.out.println(report +"\n"+ "Total price: " +totoalPrice);






    }
}