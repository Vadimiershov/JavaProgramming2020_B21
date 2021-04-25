package day50_Polymorphizm;

import day47_Abstraction.EmployeeTask.Developer;
import day47_Abstraction.EmployeeTask.Employee;
import day47_Abstraction.EmployeeTask.Tester;
import day47_Abstraction.EmployeeTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {

        Employee[] employees = {

                new Tester("Minin", 29, 'F', "SDET", "S123", 75_000),
                new Developer("John", 25, 'M', "Developer", "G456", 90_000)


        };

        int countTesters = 0;
        int countDeveloper = 0;

        for (Employee each : employees) {
            if (each instanceof Tester) {
                countTesters++;
            }
            if (each instanceof Developer) {
                countDeveloper++;
            }
        }
        System.out.println(countTesters);
        System.out.println(countDeveloper);
        System.out.println("===============================================================================");

        ArrayList<Employee> scrumMembers = new ArrayList<>();
        scrumMembers.addAll(Arrays.asList(employees));

        System.out.println(scrumMembers.size());

        scrumMembers.removeIf(p -> p instanceof UberDriver);

        System.out.println("======================================================================================");

        ArrayList<Employee> testers = new ArrayList<>();
        ArrayList<Employee> developers = new ArrayList<>();

        scrumMembers.forEach( each ->{if (each instanceof Tester)testers.add(each); else developers.add(each);});

/*
        for (Employee each : scrumMembers) {
            if (each instanceof Tester) {
                testers.add(each);
            } else {
                developers.add(each);
            }

        }
*/
    }
    }
