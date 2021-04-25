package day37_CustomClass;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch 21");
        Student student1 = new Student();
        student1.setInfo("Aaron",'M', LocalDate.of(2000,11,23),"A01",3.5);

        System.out.println(list);
        System.out.println(str);
        System.out.println(student1);

        System.out.println("======================================================================================");
        Student student2 = new Student();
        student2.setInfo("Daniel", 'M',LocalDate.of(1990,10,25),"C456", 5.0);
        System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Mary",'F',LocalDate.of(1995,11,30),"AS456",4.6);
        System.out.println(student3);

        System.out.println("========================================================================================");

        ArrayList<Student> studentlist  = new ArrayList<>(Arrays.asList(student1,student2,student3));

        System.out.println(studentlist);
        System.out.println("=========================================================================================");
        Student[] students = {student1, student2, student3};

        System.out.println(Arrays.toString(students));
        System.out.println("========================================================================================");

        for (Student each: students){
            if(each.ID.equals("C456"))
                System.out.println(each);
        }


    }



}
