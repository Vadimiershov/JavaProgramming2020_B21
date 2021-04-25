package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: " + salary);
        System.out.println("State tax is: " + stateTax);
        System.out.println("Federal tax is: " + federalTax );
        System.out.println("Total tax is: " + totalTax);
        System.out.println("Salary After Tax: " + salaryAfterTax);


    }


}
