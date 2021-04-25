package day11_MultiBranchIf;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int monthNumber = 12;
        String month = " ";

        if(monthNumber > 11){
            month = "December";
        }else if(monthNumber > 10){
            month = "November";
        }else if(monthNumber > 9){
            month = "October";
        }else if(monthNumber > 8){
            month = "September";
        }else if(monthNumber > 7){
            month = "August";
        }else if(monthNumber >6){
            month = "July";
        }else if(monthNumber>5){
            month = "June";
        }else if(monthNumber> 4){
            month = "May";
        }else if(monthNumber > 3){
            month = "April";
        }else if(monthNumber > 2){
            month = "March";
        }else if (monthNumber > 1){
            month = "February";
        }else{
            month = "January";
        }
        System.out.println(month);


    }


}
