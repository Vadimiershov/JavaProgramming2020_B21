package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {

        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "USA" || c2 == "USA";

        System.out.println(name2+ " is eligible to vote: " + eligible);


    }


}
