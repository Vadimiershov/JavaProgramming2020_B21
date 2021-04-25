package day54_Map;

import java.util.*;

public class ListOfMap {

    public static void main(String[] args) {
        LinkedHashMap<String,String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Adilet 01", "SM");
        scrum1.put("Adilet 02", "BA");
        scrum1.put("Fagan  03" , "PO");
        scrum1.put("Julia  04" , "Developer");
        scrum1.put("Mahdi  05" , "Developer");
        scrum1.put("Mohammad  05" , "Tester");
        scrum1.put("Sinan  06" , "Tester");
        scrum1.put("Ummahan  07" , "Tester");
        scrum1.put("Ali  08" , "Tester");

        LinkedHashMap<String,String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Khrystyna" , "PO");
        scrum3.put("Meredith" , "Automation Tester");
        scrum3.put("Nikola" , "BA");
        scrum3.put("Mariana" , "SM");
        scrum3.put("Fatih" , "Manual Tester");
        scrum3.put("Viktoriya" , "Developer");
        scrum3.put("Bayana" , "SDET");
        scrum3.put("Ruslan" , "SDET");


        LinkedHashMap<String,String> scrum4 = new LinkedHashMap<>();
        scrum4.put("Omer","Developer");
        scrum4.put("Dragisa","BA");
        scrum4.put("Gulistan","SM");
        scrum4.put("Natalie","PO");
        scrum4.put("Sladjan","SDET");
        scrum4.put("Abiel","Developer");
        scrum4.put("Alex","SDET");
        scrum4.put("Ghalip","Developer");
        scrum4.put("Abishek","Developer");
        scrum4.put("Khojasta","SDET");
        scrum4.put("Marina","Developer");

        List<Map<String,String>> listOfMaps = new ArrayList<>();
        listOfMaps.addAll(Arrays.asList(scrum1,scrum3,scrum4));
        System.out.println(listOfMaps);

        System.out.println("========================================================================");
//print all SM ' names
        for(Map<String,String> eachMap: listOfMaps){
            for(Map.Entry<String,String> eachPair : eachMap.entrySet()){
                if(eachPair.getValue().equals("SM")){
                    System.out.println(eachPair.getKey());
                }
            }
            //System.out.println(eachMap);
        }
        System.out.println("=========================================================================");
        for(int i=0; i<= listOfMaps.size()-1; i++){
            Map<String,String> eachMap = listOfMaps.get(i);
            for (String name : eachMap.keySet()) {
                String jobTitle = eachMap.get(name);
                if(jobTitle.equals("Developer"))
                    System.out.println(name);
            }
        }
    }


}
