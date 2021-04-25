package day53_Collection;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,5,4,3,2,12));

        for (int i = 0; i <= list.size()-1; i++) {
            if(list.get(i)<5){
               list.remove(i);
           }
        }


        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){  //stop after reaching the last object
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("======================================================================");

        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.5,2.0,3.4,4.6,5.7,6.8,7.5,8.9,5.0,4.2,3.1,1.5,4.7,7.5));

        //set.removeIf(p-> p < 4.5);
        for(Iterator<Double> i = set.iterator(); i.hasNext(); ){
            if(i.next() < 4.5){
                i.remove();
            }
        }
        System.out.println(set);
        System.out.println("=================================================");

        List<String> names=  new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","aHMEd","John","Erjon","Daniel","Mustafa"));

        //names.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        //System.out.println(names);

//        for (Iterator<String> i = names.iterator(); i.hasNext();){
//            if(i.next().equalsIgnoreCase("ahmed")){
//                i.remove();
//            }
//        }
//        System.out.println(names);

        Iterator<String> n = names.iterator();
        while (n.hasNext()){
            String eachNames = n.next();
            if(eachNames.equalsIgnoreCase("ahmed")){
                n.remove();
            }
        }
        System.out.println(names);


    }

}
