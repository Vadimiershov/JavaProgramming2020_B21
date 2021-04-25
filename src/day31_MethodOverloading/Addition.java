package day31_MethodOverloading;

public class Addition {

    public static void main(String[] args) {

        System.out.println(additionOf2Numbers(100,200));
        System.out.println(additionOf3Numbers(100,100,200));
        System.out.println(additionOf4Numbers(100,200,200,100));

    }

    public static int additionOf2Numbers(int a, int b){
        return a+b;
    }

    public static int additionOf3Numbers(int a, int b, int c){
        return additionOf2Numbers(a,b)+c;
    }

    public static int additionOf4Numbers(int a, int b, int c, int d){
        return additionOf2Numbers(a, b)+additionOf2Numbers(c,d);
    }



}
