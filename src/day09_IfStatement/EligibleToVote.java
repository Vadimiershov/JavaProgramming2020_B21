package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "John";
        String citizenship = "USA";
        boolean isEligeble = citizenship == "USA";

        System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden?\n\t"+isEligeble);
        System.out.println("=========================================================================");

        String name2 = "Aaron";
        boolean isUsCitizen = false;

        boolean eligibleToVote = isUsCitizen == true;

        System.out.println(name2+ " is eligible to vote for Donald Trump or Joe Biden?\n\t"+eligibleToVote);


    }


}
/*
write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false

 */