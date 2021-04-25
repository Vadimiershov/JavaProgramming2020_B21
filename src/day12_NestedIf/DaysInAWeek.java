package day12_NestedIf;

public class DaysInAWeek {

    public static void main(String[] args) {

        int number = 7;
        String day = "";

        if(number>=1 && number<=7){
            if(number==1){
            day = "Monday";
            }if(number==2){
                day = "Tuesday";
            }if(number==3){
               day = "Wednesday";
            }if(number==4){
                day= "Thursday";
            }if(number==5){
                day = "Friday";
            }if (number==6){
                day = "Saturday";
            }else {
                day = "Sunday";
            }
        }else {
            day = "Invalid";
        }


    }


}
