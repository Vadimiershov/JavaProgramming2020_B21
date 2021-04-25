package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimePractice2 {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE");

        LocalDate DofB = LocalDate.of(1990,11,5);

        //10 years ago

        int age1 = LocalDate.now().minusYears(10).getYear() - DofB.getYear();

        System.out.println(age1);

        System.out.println("===============================================================================");

        LocalDate dateOfBirth = LocalDate.of(2005,5,19);
        int currentAge = LocalDate.now().getYear() - dateOfBirth.getYear();

        if (currentAge>20)
            System.out.println("You are eligible to buy alcohol");
        else {
            LocalDate eligible = LocalDate.of(LocalDate.now().plusYears(21 - currentAge).getYear(), dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth());

            System.out.println("You will be eligible to buy alcohol: "+eligible.format(df));
        }



    }



}
