package day41_Encapsulation;

public class Data {

    public static String publicVariable = "A";

    private static String privateVariable = "B";

    static   String defaultVariable = "C";

     Data(){


    }

    public static void publicMethod(){
        System.out.printf("Public Method");
    }

    private static void priveteMethod(){
        System.out.println("private Method");
    }

    static void defaultMethod(){
        System.out.println("default Method");
    }

}
