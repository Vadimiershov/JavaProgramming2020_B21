package day10_IfElseStatement;

public class ValidTriangle {

    public static void main (String[] args){

        double angel1 = 60;
        double angel2 = 60;
        double angel3 = 60;

        boolean valid = (angel1 + angel2 + angel3) == 180;
        boolean rightTriangle = angel1 == 90 || angel2==90 || angel3==90;

        if(valid){
            System.out.println("It is a valid triangle");
        }
        if(!valid){
            System.out.println("It is not a valid triangle");
        }
        if(rightTriangle){
            System.out.println("This is a right triangle");
        }
        if(!rightTriangle){
            System.out.println("This is not a right triangle");
        }

    }


}
