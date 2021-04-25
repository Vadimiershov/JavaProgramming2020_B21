package Day42_Inheritance.Person;

public class PersonObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Vadym",30,'M',"SDET",0235,95000);
        System.out.println(tester1);
        tester1.testing();
        tester1.personEat();
        tester1.personSleep();


    }



}
