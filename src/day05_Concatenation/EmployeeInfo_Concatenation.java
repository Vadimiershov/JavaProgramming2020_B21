package day05_Concatenation;

public class EmployeeInfo_Concatenation {

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

        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName+" gender is: "+gender);
        System.out.println(fullName+" age is: "+age+" years old");
        System.out.println(fullName+" works at: "+companyName);
        System.out.println(fullName+" Job title is :"+jobTitle);
        System.out.println(fullName+" salary is: "+salary+" $");
        System.out.println(fullName+" is full time employee: "+ isFullTime);
        System.out.println(fullName+" is married: "+isMarried);

        System.out.println("=================================================================");

        String myName = "Vadym";
        String myLAstName = "Iershov";
        String myFullName = myName + myLAstName;
        int myAge = 30;
        char myGender = 'M';
        long phoneNumber = 5152270376l;
        String SSN = "070794348";

        System.out.println("full name is: " + myFullName);
        System.out.println("age is: "+ myAge + " years old");
        System.out.println("gender is: " + myGender);
        System.out.println("Phone number is: " + phoneNumber);
        System.out.println("SSN is: " + SSN);






    }


}

/*
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
 */