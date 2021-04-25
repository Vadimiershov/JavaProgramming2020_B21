package day29_Methods;

public class MethodsWithoutParameters2 {

    public static void evenNumbersTill100(){

        for (int i = 1; i < 101; i++) {
            if(i%2==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void oddNumbersTill100() {

        for (int i = 0; i < 101; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }



}
