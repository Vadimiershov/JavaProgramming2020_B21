package day43_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_VS_TryCatch2 {

    public  static void method1()throws FileNotFoundException {

        FileInputStream file = new FileInputStream("");
    }

    public static void method2()throws FileNotFoundException{
        method1();
    }



}
