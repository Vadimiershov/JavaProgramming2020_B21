package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();

        student1.setInfo("Vadym", 'M', LocalDate.of(1990,5,11),"01",4.5);
        student2.setInfo("Galyna", 'F', LocalDate.of(1993,8,15),"02",4.8);
        student3.setInfo("Iryna", 'F', LocalDate.of(1994,3,23),"03",3.5);
        student4.setInfo("Aidai", 'F', LocalDate.of(1995,8,30),"04",3.9);
        student5.setInfo("Karolina", 'F', LocalDate.of(1988,9,13),"05",4.8);
        student6.setInfo("Simai", 'M', LocalDate.of(1998,7,06),"06",4.2);
        student7.setInfo("Ramazan", 'M', LocalDate.of(1992,3,28),"07",3.6);
        student8.setInfo("Oleg", 'M', LocalDate.of(1996,10,22),"08",4.7);
        student9.setInfo("Jamilia", 'F', LocalDate.of(1999,6,12),"09",2.0);
        student10.setInfo("Adam", 'M', LocalDate.of(1985,4,05),"10",4.1);

        ArrayList<Student> group26 = new ArrayList<>();
        group26.addAll(Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10));

        LocalDate oldest = group26.get(0).DofB;
        LocalDate youngest = group26.get(0).DofB;
        Student youngestStudent = null;
        Student oldestStudent = null;

        for(Student each: group26){
            if(each.DofB.isAfter(youngest)) {
                youngest = each.DofB;
                youngestStudent = each;
            }
            if(each.DofB.isBefore(oldest)){
                oldest = each.DofB;
                oldestStudent = each;
            }
        }

        System.out.println(youngestStudent);
        System.out.println(oldestStudent);

        System.out.println("============================================================================================");

        double highestGPA = group26.get(0).gpa;
        Student studentHighestGPA  = null;

        for(Student eachStudent: group26){
            double eachGPA = eachStudent.gpa;
                highestGPA = Math.max(eachGPA,highestGPA);
                studentHighestGPA = eachStudent;
            }
        System.out.println(highestGPA);
        System.out.println("===========================================================================================");

        ArrayList<Student> male = new ArrayList<>(group26);
        male.removeIf(p->p.gender == 'F');
        System.out.println(male);




        }




    }




