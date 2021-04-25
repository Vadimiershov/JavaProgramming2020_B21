package day09_IfStatement;

public class MaximumMinimum {

    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 30;

        boolean n1IsMax = num1>num2;
        boolean n2IsMax = num1<num2;
        boolean equal = num1 == num2;

        if(n1IsMax){
            System.out.println(num1 + " is maximum number");
        }

        if(n2IsMax){
            System.out.println(num2 + " is maximum number");
        }

        if(equal){
            System.out.println("equal");
        }

        boolean n1IsMin = num1 < num2;
        boolean n2IsMin = num2 < num1;

        if(n1IsMin){
            System.out.println(num1 + " is minimum number");
        }

        if(n2IsMin){
            System.out.println(num2 + " is minimum number");
        }





    }


}
