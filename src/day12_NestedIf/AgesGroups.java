package day12_NestedIf;

public class AgesGroups {

    public static void main(String[] args) {

        int age = 53;

        String ageGroups = "";

        if(age>=1 && age <=2){
            ageGroups = "infant";

        }else if(age <=5){
            ageGroups = "toddlers";

        }else if(age <=9){
            ageGroups = "kid";

        }else if(age <= 12){
            ageGroups = "pre-teen";

        }else if(age <= 17){
            ageGroups = "teenager";

        }else if(age <=20){
            ageGroups = "young adult";

        }else if(age <=39){
            ageGroups = "adult";

        }else if(age <=49){
            ageGroups = "young middle aged adult";

        }else if(age <=54){
            ageGroups = "middle aged adult";

        }else if(age <=64){
            ageGroups = "very young senior citizen";

        }else if(age <=74){
            ageGroups = "young senior citizen";

        }else if(age <=84){
            ageGroups = "senior citizen";

        }else{
            ageGroups = "old senior citizen";
        }
        System.out.println(ageGroups);

    }


}
