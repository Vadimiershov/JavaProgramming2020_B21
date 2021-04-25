package ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();


        tester1.setInfo("Karolina", "01","Tester","Cybertek",85000,'F');
        tester2.setInfo("Adam", "02","Tester","Cybertek",90000,'M');
        tester3.setInfo("Simai","03","Tester Engeneer","Cybertek",95000,'M');

        Developers developer1 = new Developers();
        Developers developer2 = new Developers();
        Developers developer3 = new Developers();
        Developers developer4 = new Developers();
        Developers developer5 = new Developers();

        developer1.setInfo("Oleg","04","Developer","Cybertek",110000,'M');
        developer2.setInfo("Ramazan","05","Developer","Cybertek",90000,'M');
        developer3.setInfo("Irina","06","Developer","Cybertek",130000,'F');
        developer4.setInfo("Aidai","07","Developer","Cybertek",85000,'F');
        developer5.setInfo("Zhamilia","08","Developer","Cybertek",980000,'F');

        Tester[]testers = {tester2,tester3};
        Developers[]developers = {developer1,developer2,developer3,developer4};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.setInfo("Vadym","Sobirgon","Galyna");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);

        for(Developers eachDev:scrum1.developersTeam){
            System.out.println(eachDev);
        }

        for(Tester eachTester: scrum1.testersTeam){
            System.out.println(eachTester);
        }


        ScrumTeam scrum2 = new ScrumTeam();
        Tester tester4 = new Tester();
        Tester tester5 = new Tester();

        Developers developer6 = new Developers();
        Developers developer7 = new Developers();

        tester4.setInfo("Olesea","GR-35","SDET","Javaholics", 180000,'F');
        tester5.setInfo("Courtney","GR-34","SDET","Javaholics", 190000,'F');

        developer6.setInfo("ALtynai","GR-24","Full-Stack Developer","Javaholics", 180000,'F');
        developer7.setInfo("Shardae","GR-25","Full-Stack Developer","Javaholics", 170000,'F');

        scrum2.addTester(tester4);
        scrum2.addTester(tester5);
        scrum2.addDeveloper(developer6);
        scrum2.addDeveloper(developer7);

        scrum2.setInfo("Svetlana","Daniel","Mayasa");

        System.out.println(scrum1);
        System.out.println(scrum2);

        //scrum1.removeDeveloper("04");
        //System.out.println(scrum1);

        System.out.println("============================================================================================");

        ScrumTeam[] scrums = {scrum1, scrum2};

        // print the names and salary of every single testers
        for (ScrumTeam eachScrum : scrums){
            for(Tester eachTester: eachScrum.testersTeam){
                System.out.println(eachTester.name+ " : "+eachTester.salary);
            }
        }

        System.out.println("============================================================================================");
        // print names and salary of every single developers
        for (ScrumTeam eachScrum : scrums){
            for(Developers eachdeveloper: eachScrum.developersTeam){
                System.out.println(eachdeveloper.name+ " : "+eachdeveloper.salary);
            }
        }
        System.out.println("============================================================================================");
        int countDevelopers = 0;
        int countTesters = 0;
        for(ScrumTeam each: scrums){
            countDevelopers += each.developersTeam.size();
            countTesters += each.testersTeam.size();
        }
        System.out.println("Developers: "+ countDevelopers);
        System.out.println("Testers: "+ countTesters);

        System.out.println("============================================================================================");

        scrums[1].SM = "Aihait";

        System.out.println(scrums[0].SM);
        System.out.println(scrums[1].SM);

        System.out.println("============================================================================================");

        ArrayList<ScrumTeam>scrumList = new ArrayList<>();

        scrumList.addAll(Arrays.asList(scrums));

        System.out.println(scrumList);

        System.out.println("===========================================================================================");

        for(int i=0;i<scrumList.size();i++){
            ScrumTeam eachTeam = scrumList.get(i);

            for(int j=0;j<eachTeam.testersTeam.size();j++){
                Tester eachTester = eachTeam.testersTeam.get(j);
                System.out.println( eachTester.name + " : " +eachTester.salary );
            }
            System.out.println("Developers---------------------------------------------------------------------------------------");
            for(int k=0;k<eachTeam.developersTeam.size();k++){
               Developers eachDeveloper = eachTeam.developersTeam.get(k);
                System.out.println(eachDeveloper.name+" : "+ eachDeveloper.salary);
            }
        }

        System.out.println("===============================================================================");


        for(ScrumTeam eachScrum : scrumList){
            for(Tester eachTester : eachScrum.testersTeam){
                System.out.println(eachTester.name+" : "+eachTester.salary);
            }
            System.out.println("Developers------------------------------------------------------------------------------------");
            for(Developers eachDeveloper : eachScrum.developersTeam){
                System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);

            }

        }


    }



}
