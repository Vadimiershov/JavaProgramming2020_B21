package day10_IfElseStatement;

public class MaximNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        boolean n1IsMax= n1 > n2 && n1 > n3;
        boolean n2IsMax= !n1IsMax && n2 > n3;
        boolean n3IsMax= !n1IsMax && !n2IsMax;

        String str = " is maximum number";

        if(n1IsMax){
            System.out.println(n1 + str);
        }

        if(n2IsMax){
            System.out.println(n2 + str);
        }

        if(n3IsMax){
            System.out.println(n3 + str);
        }

        System.out.println("=============================================================");

        int a = 20000;
        int b = 2000;

        int max = 0;

        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println(max);

    }


}
