package day12_NestedIf;

public class AgesGroups2 {

    public static void main(String[] args) {

        int age = 53;

        String ageGroups = (age<=2) ? "infant" :(age<=5) ? "toddlers" :(age<=9) ? "kid" :
                (age<=12) ? "pre-teen" :(age<=17) ? "teenager" :(age<=20) ? "young adult" :
                        (age<=39) ? "adult" :(age<=49) ? "young middle adult" : (age<=54) ? "middle " +
                                "aged adult" :(age<=64) ? "very young senior citizen" :(age<=74) ?
        "young senior citizen" : "senior citizen";



        System.out.println(ageGroups);

    }


}
