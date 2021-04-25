package day43_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println("Hello world");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }finally {
            System.out.println("Closed");
        }

        System.out.println("Test Completed");
    }



}
