package day43_exceptions;

import java.time.LocalTime;

public class EveryDaysLunchBreak {

    public static void main(String[] args) {

        LocalTime current = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1,0);

        if(current.equals(lunchTime)){
            throw new LunchBreakException("MUHTAR WE NEED TO GO TO LUNCH!!!");
        }else{
            System.out.println("Continue");
        }



    }



}
