package day11_MultiBranchIf;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = 3;

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 8 || month == 10;
        boolean days31 = !days28 && !days30;

        int days = 0;

        if(days28){
            days = 28;
        }
        if(days30){
            days = 30;
        }
        if(days31){
            days = 31;
        }
        System.out.println(days + " days");

        System.out.println("==================================================================");

        int days2 = (days28) ? 28 :(days30) ? 30 : 31;
        System.out.println(days2);



    }
}
/*
1. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            Ex:
                month = 2
                output:
                    28 days
                month = 9
                output:
                    30 days
        Hints: it cannot be done with if&else statement, you will need single if statements
        28 days: 2
        30 days: 4, 6, 9, 11
        31 days: 1, 3, 5, 7,8,10
 */