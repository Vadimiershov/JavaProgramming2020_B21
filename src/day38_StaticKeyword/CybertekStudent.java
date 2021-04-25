package day38_StaticKeyword;

public class CybertekStudent {

    public String name;
    public int age;
    public char gender;
    public int groupNumber;

    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;



    public void study(){
        System.out.println(name +" is studying Java");
    }

    public static void getSchoolInfo(){
        System.out.println("School is: "+ schoolName);
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", groupNumber=" + groupNumber +
                ", is Online: "+ isOnlineStudent+
                ", School Name: "+ schoolName+
                '}';
    }

    public void setInfo(String name, int age, char gender, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.groupNumber = groupNumber;
    }
}



/*
Task
        create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
        create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixingBug(), toString()
        create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
                            toString(): prints number of tester,& developers,  PO name, SM name, BA name

        create a class called MyScrumTeam:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
                    Answer the interview question "Tell me about your scrum team"

 */