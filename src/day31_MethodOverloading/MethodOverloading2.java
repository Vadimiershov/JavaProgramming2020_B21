package day31_MethodOverloading;

public class MethodOverloading2 {

    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

        System.out.println(sum(5.5,6.5));
        System.out.println(sum(10.5,10,4.6));



    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return sum(a,b)+a;
    }

    public static int sum(int a,int b, int c, int d){
        return sum(a,b,c) + d;
    }

    public static double sum(double a,double b){
        return a+b;
    }

    public static double sum(double a,double b,double c){
        return sum(a,c)+b;
    }
    public static double sum(double a,double b,double c,double d){
        return sum(a,b,d)+c;
    }


}
