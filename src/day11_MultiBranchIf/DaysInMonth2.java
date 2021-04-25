package day11_MultiBranchIf;

public class DaysInMonth2 {

    public static void main(String[] args) {

        int month = 3;

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 8 || month == 10;
        boolean days31 = !days28 && !days30;

        int days = 0;

        if(days28){
            days = 28;
        }else if(days30){
            days = 30;
        }else {
            days = 31;
        }
        System.out.println(days);
    }


}
