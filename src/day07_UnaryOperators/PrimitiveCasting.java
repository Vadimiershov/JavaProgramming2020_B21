package day07_UnaryOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {

        short a = 3000;
        long b = a; // implicit casting, automatically done

        double d1 = 200.5;
        int i1 = (int) d1; //200

        System.out.println(i1);

        System.out.println("======================================================");

        long l1 = 100;
        short s1 = (short)l1; // explicit casting

        System.out.println(s1);

        double d2 = 300;
        float f1 = (float) d2;  // hold Alt + hit Enter, shortcut for casting




    }


}
