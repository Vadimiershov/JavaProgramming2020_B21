package day41_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.printf(Data.publicVariable);

        System.out.println();

        Data obj = new Data();

        Data.defaultMethod();
        Data.publicMethod();
        //Data.privateMethod();

    }
}
