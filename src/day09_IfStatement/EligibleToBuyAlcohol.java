package day09_IfStatement;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        String name = "James";
        int age = 19;
        boolean isEligible = age >= 21;

        System.out.println(name + " is eligible to buy alcohol?\n\t" + isEligible);






    }


}
/*
 write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false
            name = "Aaron"
            age = 39
            output:
                Aaron is eligible to buy alcohol?
                    true

 */