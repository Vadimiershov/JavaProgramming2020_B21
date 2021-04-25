package day43_exceptions;

import java.util.NoSuchElementException;

public class ExceptionTypes {


    public static void main(String[] args) {


        try {
            throw new NoSuchElementException("Element no found");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        System.out.println("Test Ended");

    }

}






