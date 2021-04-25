package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {

    public static void main(String[] args) {

        /*
        year: yyyy
        month: MM(number,MMM(3letters of the month),MMMM(full name)
        days:d

        name of day:E(3 letters)EEEE(full name)

        Local Time:
        hours:hh
        minutes:mm
        seconds:ss
        am/pm: a
         */

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/EEEE/yyyy");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm:ss a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println( now.format(tf));

        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println(t1);
        System.out.println(t1.format(tf));

        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);

        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");
        System.out.println(dt1.format(t2));

        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow); //true
        boolean r2 = today.isAfter(tomorrow);  //false

        System.out.println(r1);
        System.out.println(r2);


        //calculate the age

        int currentYear  = LocalDate.now().getYear();
        LocalDate DofB = LocalDate.of(2000,5,19);
        int age = currentYear - DofB.getYear();

        System.out.println(age);

        LocalDate rightNow = LocalDate.now();

        LocalDate holidayBreak = rightNow.plusDays(2);

        System.out.println(holidayBreak);

        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);

        System.out.println(lunchBreak.format(tf));

        LocalTime classStarts = LocalTime.of(10,0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println(firstBreak);

        LocalTime secondBreak = firstBreak.plusMinutes(15).plusMinutes(45);
        System.out.println(secondBreak);



    }



}
