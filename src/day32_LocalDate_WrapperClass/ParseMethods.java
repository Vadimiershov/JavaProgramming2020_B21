package day32_LocalDate_WrapperClass;

import javax.sound.midi.Soundbank;

public class ParseMethods {

    public static void main(String[] args) {

        String data = "123";
        System.out.println(data+3);

        int num1 = Integer.parseInt(data);
        //primitive = primitive

        Integer num2 = Integer.parseInt(data);
        // wrapper class <=== AutoBoxing

        System.out.println(num1+3);
        System.out.println(num2+3);

        String s2 = "2.5";
        Double s3 = Double.parseDouble(s2);

        System.out.println(s3+1);

        String s4 = "true";
        boolean r1 = Boolean.parseBoolean(s4);
        Boolean r2 = Boolean.parseBoolean(s4); //Auto boxing

        System.out.println(!r1); //default value for boolean is false

    }



}
