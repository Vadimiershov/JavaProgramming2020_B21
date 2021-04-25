package day11_MultiBranchIf;

public class NameOfTheWeekday {

    public static void main(String[] args) {

        int number = 3;

        String day = " ";

        if(number >6){
            day = "Sunday";
        }else if (number >5){
            day = "Saturday";
        }else if (number>4){
            day = "Friday";
        }else if (number > 3){
            day = "Thursday";
        }else if (number > 2){
            day = "Wednesday";
        }else if (number > 1){
            day = "Tuesday";
        }else{
            day = "Monday";
        }
        System.out.println(day);


    }
}
