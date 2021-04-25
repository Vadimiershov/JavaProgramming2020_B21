package day36_CustomClass;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankOfAmerica {

    public static void main(String[] args) {

        String companyName = "Bank of America";

        Employees[] employee = {
                new Employees(),
                new Employees(),
                new Employees(),
                new Employees(),
                new Employees()
        };

        employee[0].setInfo("Angelina Jolie",'F',"Developer",companyName,100000, "12345", LocalDate.of(2018,04,14));
        employee[1].setInfo("Brad Pitt",'M',"Scrum Master",companyName,140_000,"0003",LocalDate.of(2016, 9,14));
        employee[2].setInfo("Obi-Wan Kenobi", 'M', "BA", companyName, 164000, "3-CPO", LocalDate.of(2010, 02, 14));
        employee[3].setInfo("Johny Depp", 'M', "SDET", companyName, 164000.50, "ABC123", LocalDate.of(2018, 06, 23));
        employee[4].setInfo("John Snow", 'M', "CEO", companyName, 240000, "0004", LocalDate.of(2015, 9, 19));

        for(Employees each: employee){
            each.getInfo();
        }
        System.out.println("==========================================================================================");
        ArrayList<Employees> SDetsaAndDev = new ArrayList<>(Arrays.asList(employee));

        SDetsaAndDev.removeIf(p -> !(p.jobTitle.equalsIgnoreCase("SDET")||p.jobTitle.equalsIgnoreCase("Developer")));
        // remove the employees IF job title of the employee is not SDET or not Developer
        for(Employees each: SDetsaAndDev) {

            System.out.println(each.name+" : "+each.jobTitle+", "+each.salary);
        }

        System.out.println("=========================================================================================");

        ArrayList<Employees> SalaryAbove200k = new ArrayList<>();

        SalaryAbove200k.addAll(Arrays.asList(employee));
        //for(Employees each: employee)SalaryAbove200k.add(each);
        SalaryAbove200k.removeIf(p-> p.salary<200000);


        System.out.println("==========================================================================================");

        double maxSalary = employee[0].salary; // assume that first employee salary is max
        String name = "";
        for(Employees each:employee){
          maxSalary = Math.max(maxSalary,each.salary);
        name = each.name;

        }
        System.out.println(name+" : "+maxSalary);





    }

}
