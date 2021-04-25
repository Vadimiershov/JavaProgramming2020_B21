package day53_Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Afrooz", 120000.5);
        employeeInfo.put("Muhammad", 120000.0);

        //employeeInfo.remove("Muhammad");

        System.out.println(employeeInfo.size());

        System.out.println("Salary of Muhamad: " + employeeInfo.get("Muhammad")); // returning to us the salary

        System.out.println(employeeInfo.containsKey("Afrooz"));  // removing true/false

        System.out.println(employeeInfo.containsValue(120000.0));

        for(String eachKey: employeeInfo.keySet()){
            System.out.println(eachKey + " " + employeeInfo.get(eachKey));
        }

        System.out.println("====================================================");

        employeeInfo.put("Iryna",80000.0);
        employeeInfo.put("Emre",95000.0);
        employeeInfo.put("Apo",100000.0);

        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        String nameMax  = "", nameMin = "";

        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary > max){
                max = eachSalary;
                nameMax = eachName;
            }
            if(eachSalary < min){
                min = eachSalary;
                nameMin = eachName;
            }
        }
        System.out.println(nameMax + " : " + max);
        System.out.println(nameMin + " : " + min);

        System.out.println("===================================================");

        //employeeInfo.values().forEach(p->{ System.out.println(p); });

        for(Double eachValue : employeeInfo.values()){
            System.out.println(eachValue);
        }

        List<Double> salaries = new ArrayList<>(employeeInfo.values());
        System.out.println(salaries);


    }

}
