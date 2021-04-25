package day09_IfStatement;

public class EligibleToVoteTo {

    public static void main(String[]args) {

    String name = "Daniel";
    boolean isUSCitizen = true;
    int age = 38;
    boolean hasCriminalBackground = false;

    boolean isEligible = isUSCitizen == true && age >= 18 && hasCriminalBackground == false ;

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("====================================================================");




    }


}
