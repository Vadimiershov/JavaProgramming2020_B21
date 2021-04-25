package day28_MultiDimensionalArray;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] employeeName = {"John", "Rozy", "Michael", "Sam"};
        int[] employeeSalary = {10000, 200000, 30000, 40000};
        int max = employeeSalary[0];
        int min = employeeSalary[0];
        String nameOFMax = employeeName[0];
        String nameOfMin = employeeName[0];

        for (int j = 0; j < employeeSalary.length; j++) {

            System.out.println(employeeName[j] + " :$" + employeeSalary[j]);
            if (employeeSalary[j] > max) {
                max = employeeSalary[j];
                nameOFMax = employeeName[j];
            }
            if (employeeSalary[j] <= min) {
                min = employeeSalary[j];
                nameOfMin = employeeName[j];

            }
        }

        System.out.println("Max salary:" + nameOFMax + " :" + max);
        System.out.println("Min salary:" + nameOfMin + " :" + min);

    }
}




