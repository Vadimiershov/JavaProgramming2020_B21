package day32_LocalDate_WrapperClass;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        LocalDate today = LocalDate.now();

        System.out.println(yesterday);

        System.out.println(today);

        LocalDate DofB = LocalDate.of(1990,5,11);

        System.out.println(DofB);

        String [] names = {"Galyna", "Oleg", "Irina", "Nour", "Carolina"};
        LocalDate[] dateOfBirth = {
                LocalDate.of(1989,3,14),
                LocalDate.of(1990,5,30),
                LocalDate.of(1988,6,17),
                LocalDate.of(1993,7,22),
                LocalDate.of(1987,9,18)};

        for (int i = 0;i<=names.length-1;i++){
            System.out.println(names[i] + "' birthday is: "+ dateOfBirth[i]);
        }

    }



}
