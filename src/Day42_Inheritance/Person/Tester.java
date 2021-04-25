package Day42_Inheritance.Person;

public class Tester extends Employee {


    public Tester(String name, int age, char gender,String jobTitle, int ID, int hourlyRate){
        setInfo(name, age, gender, jobTitle, ID, hourlyRate);

    }

    public void testing(){
        System.out.println(name+", "+jobTitle+" is testing");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
