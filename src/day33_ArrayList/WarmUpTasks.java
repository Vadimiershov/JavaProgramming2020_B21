package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTasks {


    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy " );
        System.out.println(today.format(df));

        System.out.println("============================================================================================");


        DateTimeFormatter mDN = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
        LocalDate[] days = new LocalDate[10];
        for (int i = 0; i < days.length; i++) {
            days[i] = LocalDate.now().plusDays(i+1);
        }

        for(LocalDate each:days){
            System.out.println(each.format(mDN));
        }

        System.out.println("============================================================================================");

        String [] names = {"Galyna", "Oleg", "Irina", "Nour", "Carolina","Ayse",""};
        LocalDate[] dateOfBirth = {
                LocalDate.of(1989,3,14),
                LocalDate.of(1990,5,30),
                LocalDate.of(1988,6,17),
                LocalDate.of(1993,7,22),
                LocalDate.of(1987,9,18),
                LocalDate.of(1988,10,18)};

        String nameOfOlder = names[0];
        LocalDate older = dateOfBirth[0];

        String nameOfYoungest = names[0];
        LocalDate younger = dateOfBirth[0];

        for (int i = 0; i < dateOfBirth.length; i++) {
            if(dateOfBirth[i].isBefore(older)){
                older = dateOfBirth[i];
                nameOfOlder = names[i];
            }
            if(dateOfBirth[i].isAfter(younger)){
                younger = dateOfBirth[i];
                nameOfYoungest = names[i];
            }
        }

        System.out.println(older+" "+nameOfOlder);
        System.out.println(younger+" "+nameOfYoungest);


    }

}
/*
1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
    2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each Date in the following formar:
                MonthName/Day, Name
                ex:
                    November/25, Wednesday
    3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
 */