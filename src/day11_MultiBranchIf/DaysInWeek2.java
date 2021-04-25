package day11_MultiBranchIf;

public class DaysInWeek2 {

    public static void main(String[] args) {

        int number = 1;

        String dayOfWeek = (number == 1) ? "Monday" :(number == 2) ? "Tuesday" :(number == 3) ? "Wednesday"
                :(number == 4) ? "Thursday" :(number == 5) ? "Friday" :(number == 6) ? "Saturday" : "Sunday";
        System.out.println(dayOfWeek);


    }


}
