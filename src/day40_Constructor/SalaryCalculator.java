package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {

    public static int numberOfWorkingDays, numberOfWeeks;

    public double weeklyhours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static {
        numberOfWorkingDays = 5;
        numberOfWeeks = 52;
    }

    public SalaryCalculator(double hours, double hourlyRate, double stateTaxRate, double federalTaxRate) {

        if(stateTaxRate > 1){
            stateTaxRate /=100;
        }

        if(federalTaxRate>1){
            federalTaxRate /= 100;
        }

        this.weeklyhours = hours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = hours * hourlyRate * numberOfWeeks;
        totalTax = salary * (stateTaxRate + federalTaxRate);
        salaryAfterTax = salary - totalTax;


    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat(("0.00"));
        return "SalaryCalculator{" +
                "weeklyhours=" + weeklyhours +
                ", hourlyRate= $" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary= $" +df.format( salary) +
                ", salaryAfterTax= $" + df.format(salaryAfterTax) +
                ", totalTax= $" + totalTax +
                '}';
    }
}
