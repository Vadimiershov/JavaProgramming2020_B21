package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 100000;
        double taxRate = 0.28;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("The salary after the tax is: ");
        System.out.println(salaryAfterTax);


    }


}
/*
Task04: SalaryCalculator
    write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   taxRate = 0.28
                   totalTax = salary * taxRate;
                   salary after tax = salary - totalTax

 */