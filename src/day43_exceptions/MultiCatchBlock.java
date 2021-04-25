package day43_exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try {
            System.out.println(25 / 0);
        }catch (NoSuchElementException e){
            System.out.println("No such element exception");
        }catch(ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch(RuntimeException e){
            System.out.println("Runtime Exception");
        }

        System.out.println("--------------------------------------------------------------------------------");

        String[] names = {"Walid", "Agalar", "Ayjeren"};
        try {
            names[10] = "Muhtar";
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument exception");
        }catch (NoSuchElementException e){
            System.out.println("No such element exception");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String out of bun boundary exception");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of boundary exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }




    }



}
