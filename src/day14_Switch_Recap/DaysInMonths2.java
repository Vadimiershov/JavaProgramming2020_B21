package day14_Switch_Recap;

public class DaysInMonths2 {

    public static void main(String[] args) {

        String month = "Jan";
        String result = "";
        int year = 2020;

        switch (month){

            case "Feb": result = (year%4 == 0) ? "29 days" : "28 days";
            break;

            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov": result = "30 days";
            break;

            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec": result = "31 days";
            break;

            default: result = "Invalid month";


        }

        System.out.println(result);


    }


}
