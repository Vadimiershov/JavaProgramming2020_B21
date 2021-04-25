package day35_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class WarmupTask {

    public static void main(String[] args) {


        String[] countryNames = {"Andorra", "United Arab Emirates", " Afghanistan", "Turkey", "United States"};

        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));

        countries.removeIf( p -> p.length()>=10);

        System.out.println(countries);

        LocalDate[] arr1 = {
                LocalDate.of(2010,11,23),
                LocalDate.of(2019, 10,13),
                LocalDate.of(2020, 10,13),
                LocalDate.of(2017, 12,13),
                LocalDate.of(2015, 7,13),
                LocalDate.of(2016, 8,13),
        };
        LocalDate d1 = LocalDate.of(2016,8,15);
        ArrayList<LocalDate> dates = new ArrayList<>( Arrays.asList(arr1));

        dates.removeIf(p-> p.isBefore(d1));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yyyy, EEEE");

        for (LocalDate each : dates) {

            System.out.println(each.format(df));
        }




    }
}
