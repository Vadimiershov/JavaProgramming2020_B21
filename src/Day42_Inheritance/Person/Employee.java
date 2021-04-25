package Day42_Inheritance.Person;

public class Employee extends Person{

    public String jobTitle;
    public int ID, hourlyRate;



    public void setInfo(String name, int age, char gender,String jobTitle, int ID, int hourlyRate){
        setInfo( name, gender, age);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.hourlyRate = hourlyRate;
    }

    public void work(){
        System.out.println(name+", "+jobTitle+" working");
    }


    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
