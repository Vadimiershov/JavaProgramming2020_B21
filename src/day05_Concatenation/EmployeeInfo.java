package day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Vadym";
        String lastName = "Iershov";
        String fullName = firstName+" "+lastName;
        char gender = 'M';
        int age = 30;
        String companyName = "Cybertek";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.print("Employee full name is: ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print(" gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print(" age is: ");
        System.out.print(age);
        System.out.println(" Years old");

        System.out.print(fullName);
        System.out.print(" company name is: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print(" Job title is: ");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print(" salary is: ");
        System.out.print(salary);
        System.out.println(" $");

        System.out.print(fullName);
        System.out.print(" is full time employee: ");
        System.out.println(isFullTime);

        System.out.print(fullName);
        System.out.print("is married: ");
        System.out.println(isMarried);


    }




    }


/*
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

 */