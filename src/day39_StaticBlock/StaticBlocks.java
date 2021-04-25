package day39_StaticBlock;

import day36_CustomClass.Employees;

import java.time.LocalDate;

public class StaticBlocks {

    public static String company;
    public static Employees employee1;
    public int a;
    public static int b;

    static {
        company = "CapitalOne";
        employee1 = new Employees();
        employee1.setInfo("John",'M',"SDET","Google",110000,"A123", LocalDate.of(2019,05,13));
        b=200;
    }

    public static void main(String[] args) {

        company = "CapitalOne1";
        employee1 = new Employees();
        b=200;
        employee1.setInfo("John",'M',"SDET","Google",110000,"A123", LocalDate.of(2019,05,13));

        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);



    }




    }




