package day13_SwitchStatement;

public class NameOfTheMonth {

    public static void main(String[] args) {

        int month = 7;

        String nameOfTheMonth = "";

        switch (month){
            case 1:
                nameOfTheMonth = "January";
                break;

            case 2 :
                nameOfTheMonth = "February";
                break;

            case 3 :
                nameOfTheMonth = "March";
                break;

            case 4:
                nameOfTheMonth = "April";
                break;

            case 5:
                nameOfTheMonth = "May";
                break;

            case 6:
                nameOfTheMonth = "June";
                break;

            case 7:
                nameOfTheMonth = "July";
                break;

            case 8:
                nameOfTheMonth = "August";
                break;

            case 9:
                nameOfTheMonth = "September";
                break;

            case 10:
                nameOfTheMonth = "October";
                break;

            case 11:
                nameOfTheMonth = "November";
                break;

            case 12:
                nameOfTheMonth = "December";
                break;

            default:
                nameOfTheMonth = "Invalid";
                break;
        }
        System.out.println(nameOfTheMonth);

    }


}
