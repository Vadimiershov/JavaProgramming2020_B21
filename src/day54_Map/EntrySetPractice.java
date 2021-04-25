package day54_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("A",85);
        students.put("B",75);
        students.put("C",89);
        students.put("D",95);
        students.put("E",88);
        System.out.println("===========================================================");
        for (String eachKey : students.keySet()) {  //iterate each key
            System.out.println(eachKey + " : " + students.get(eachKey));
        }
        System.out.println("=============================================================");
            for (Integer value : students.values()) {
                System.out.println(value);
            }
        System.out.println("=============================================================");
        for (Map.Entry<String, Integer> each : students.entrySet()){
            System.out.println(each.getKey()+ " : "+each.getValue());
        }
    }


}
