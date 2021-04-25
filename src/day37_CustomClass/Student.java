package day37_CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DofB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DofB, String ID, double gpa){
        this.name = name;
        this.gender = gender;
        this.DofB = DofB;
        age = LocalDate.now().getYear() - DofB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }


    public String toString() {
        return  "Student{"+
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", DofB=" + DofB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }
}
