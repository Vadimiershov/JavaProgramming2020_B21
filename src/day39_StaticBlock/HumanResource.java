package day39_StaticBlock;

import day36_CustomClass.Employees;

import java.time.LocalDate;

public class HumanResource {

    public static Employees employee1, employee2, employee3, employee4,employee5;

    static {
        employee1 = new Employees();
        employee1.setInfo("Vadym",'M',"SDET","Apple",110000,"01", LocalDate.of(2015,05,05));
        employee2 = new Employees();
        employee2.setInfo("Galyna",'F',"SM","Google",90000,"01", LocalDate.of(2018,05,05));
        employee3 = new Employees();
        employee3.setInfo("Iryna",'F',"SDET","Amazon",150000,"01", LocalDate.of(2016,05,05));
        employee4 = new Employees();
        employee4.setInfo("Simai",'M',"Developer","Expedia",130000,"01", LocalDate.of(2010,05,05));
        employee5 = new Employees();
        employee5.setInfo("Karolina",'F',"Tester","Microsoft",990000,"01", LocalDate.of(2020,05,05));


    }




}
