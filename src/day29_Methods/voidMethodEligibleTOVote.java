package day29_Methods;

public class voidMethodEligibleTOVote {

    public static void main(String[] args) {

        eligibleToVoid(18,"USA",true);

    }


    public static void eligibleToVoid(int age, String country, boolean alive){

        if(country.equalsIgnoreCase("USA")){

            if(alive){

                if(age>=18){
                    System.out.println("You are eligible to vote");
                }else {
                    System.out.println("You must be at least 18 years old");
                }


            }else {
                System.out.println("You must be come back to life to vote");
            }
        }else{
            System.out.println("You must be USA citizen");
        }

    }

}
