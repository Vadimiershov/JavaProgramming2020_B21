package day11_MultiBranchIf;

public class Ternary {

    public static void main(String[] args) {

        int n = 100;

        String result2 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result2);

        System.out.println("=======================================================");

        int age = 25;
        String citizen = "USA";

        String eligibleToVote = ( age > 18 && citizen == "USA") ? "Eligible to vote" : "Not eligible to vote";

        System.out.println(eligibleToVote);

        System.out.println("===================================================================");

        int personAge = 18;
        String buyAlcohol = (personAge >= 18) ? "Eligible to buy alcohol" : "Not eligible to buy";
        System.out.println(buyAlcohol);

        System.out.println("======================================================================");

        int number = 1000;
        String s2 = (number>0) ? "Positive" :(number < 0) ? "Negative" : "Zero";
        System.out.println(s2);

        System.out.println("==================================================================");

        int num1 = 10;
        int num2 = 20;

        String maxNumber = (num1 > num2) ? "First number is bigger" : "Second number is bigger";
        System.out.println(maxNumber);

        String minNumber = (num1<num2) ? "First number is smaller" : "Second number is smaller";
        System.out.println(minNumber);

        System.out.println("===================================================================");

        int number1 = 100;
        int number2 = 200;
        int number3 = 300;

        int maxNumber1 = (number1>number2 && number1>number3) ? number1
                :(number2>number1 && number2>number3) ? number2 : number3;
        System.out.println(maxNumber1);

        int minNumber1 = (number1<number2 && number1<number3) ? number1
                :(number2<number1 && number2<number3) ? number2 : number3;
        System.out.println(minNumber1);





    }


}
