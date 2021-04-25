package Office_Hours.Practice_10_28_2020;

public class MethodPractice {

    public static void main(String[] args) {

        numDivisible3();

        divisibleBy3(20,60);

        eligibleToVote(25,false);

    }

    public static void numDivisible3(){


        for (int i = 1; i < 101; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void divisibleBy3(int start,int end){

        for (int i = start; i < end; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void grade(int score){

        if(score<0||score>100){
            System.out.println("Invalid score");
        return;
        }

        char grade = (score>=90) ?'A':(score>=80) ? 'B':(score>=70)? 'C':(score>=60)? 'D':'F';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            default:
                System.out.println("Failed");
        }
    }

    public static void eligibleToVote(int age, boolean isUSCitizen){

        if(age < 18){
            System.out.println("You must be at least 18 years old");
        return;
        }

        if(isUSCitizen == false){
            System.out.println("Must be US citizen to vote");
        return;
        }

        System.out.println("You are eligible to vote");

    }


}
