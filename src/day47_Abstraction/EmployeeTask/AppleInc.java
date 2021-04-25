package day47_Abstraction.EmployeeTask;

public class AppleInc {

    public static void main(String[] args) {

        Tester tester = new Tester("Minin",29,'F',"SDET","S123",75_000);
        Developer developer = new Developer("John",25,'M',"Developer","G456",90_000);

        tester.work();
        tester.sleep();

        developer.sleep();
        developer.work();

        System.out.println(tester);
        System.out.println(developer);




    }

}
