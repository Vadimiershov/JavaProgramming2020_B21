package Practice_11_27_2020;
import java.util.Scanner;

public class PrimeNumbersInterview {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number to see if is Prime number");
        int number = input.nextInt();
        int count = 0;  // Count to see if the number is divisible by another
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  //4
                count++;  //1,2,3
                System.out.println(number + " is divisible by " + i);
            }
        }
        if (count == 2) {
            System.out.println(number + " is a prime number");
        } else {
            System.err.println(number + " is not a prime number");
        }


    }


}
