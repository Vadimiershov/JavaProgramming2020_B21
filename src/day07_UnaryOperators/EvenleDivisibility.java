package day07_UnaryOperators;

public class EvenleDivisibility {

    public static void main(String[] args) {

        int number = 65;

        boolean divisibleBy2 = number % 2 < 1;
        boolean divisibleBy3 = number % 3 < 1;
        boolean divisibleBy5 = number % 5 < 1;

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);



    }


}
/*
 Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;  ==> int
                divisibleBy2 ==> true/false
                divisibleBy3 ==> true/false
                divisbileBy5 ==> true/false
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
Collapse

 */