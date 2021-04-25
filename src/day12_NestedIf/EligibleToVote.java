package day12_NestedIf;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 22;
        String citizenship = "USA";

        if(citizenship == "USA"){

            if(age>=18){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("You must be at least 18 years old");
            }
        }else {
            System.out.println("You must be USA citizenship in order to vote");
        }

    }


}
