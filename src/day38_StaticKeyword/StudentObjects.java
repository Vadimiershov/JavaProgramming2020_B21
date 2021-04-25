package day38_StaticKeyword;

import day37_CustomClass.CybertekSchool;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("Ayse",25,'F',5);

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Erjon",30,'M',45);

        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Afrooz",35,'M',14);



    //    System.out.println(student1.schoolName);
    //    System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        CybertekStudent.getSchoolInfo();



    }


}
