package day32_LocalDate_WrapperClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(11,45);

        System.out.println(t1);

        LocalTime now = LocalTime.now();

        System.out.println(now);

        LocalDateTime t2 = LocalDateTime.of(2020,11,23,10,52);

        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.now();

        System.out.println(t3);


    }
}
