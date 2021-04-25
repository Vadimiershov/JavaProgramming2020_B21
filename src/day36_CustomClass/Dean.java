package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dean {// Dean HAS An offer

    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer(),
                new Offer()
        ));

        offers.get(0).setInfo("CA","SDET","CapitalOne",120000,true,true,false,false);
        offers.get(1).setInfo("VA","QA","Apple",115000,true,true,true,true);
        offers.get(2).setInfo("IL","Developer","Ukietech",90000,true,true,false,true);
        offers.get(3).setInfo("PA","Scrum Master","Hubmee", 150000, true,true,true,true);
        offers.get(4).setInfo("OH", "BA", "Bank Of America", 155000, true, false, true, true);
        offers.get(5).setInfo("Texas", "SDET", "Bank Of America", 100000, true, false, true, true);

        /*for(int i=0;i<=offers.size();i++){
            offers.get(i).getInfo();
        }
*/
        System.out.println("============================================================================================");


        for(Offer each:offers){
            if(each.location.equals("VA")&& each.salary >=110000){
                each.getInfo();
            }
        }

        System.out.println("============================================================================================");

        ArrayList<Offer> localOffers = new ArrayList<>(offers);

        localOffers.removeIf(p->!p.location.equals("IL"));

        System.out.println("VA offers:"+localOffers.size());

        System.out.println("============================================================================================");

        ArrayList<Offer> sdetOffers = new ArrayList<>(offers);

        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));
        System.out.println("SDET position offers "+sdetOffers.size());

        System.out.println("============================================================================================");

        ArrayList<Offer> goodSalary = new ArrayList<>(offers);
        goodSalary.removeIf(p -> p.salary <120000);

        System.out.println("$120k salary offers: "+goodSalary.size());

        System.out.println("==========================================================================================");

        ArrayList<Offer> fullTime = new ArrayList<>(offers);
        fullTime.removeIf(p->!p.isFullTime);
        System.out.println("Full time: "+fullTime.size());

    }



}
