package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first person' birth year, month, day");
        LocalDate DofBirth1 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println("Enter second person' birth year, month and day");
        LocalDate DofBirth2 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        scan.close();

        if(DofBirth1.getYear()>DofBirth2.getYear()){
            System.out.println("First person is older");
        }else if(DofBirth2.getYear()>DofBirth1.getYear()){
            System.out.println("Second person is older");
        }else{
            System.out.println("Same age");
        }
        // current age
        //after 30 years
        int age = LocalDate.now().plusYears(30).getYear() - DofBirth1.getYear();
        int age2 = LocalDate.now().getYear() - DofBirth2.getYear();
        // after 30 years:

        int after1 = age+30;
        int after2 = age2+30;

        System.out.println("after thirty years, person A will be "+after1);
        System.out.println("after thirty years, person B will be "+after1);

        LocalDate DofB3 = LocalDate.of(1980,12,5);
        System.out.println(calculateAge(DofB3,30));
    }

    /*
    parameters:
        DofB
        year
     */

    public static int calculateAge(LocalDate DofB,int year){
        return LocalDate.now().plusYears(year).getYear() - DofB.getYear();
    }



}
