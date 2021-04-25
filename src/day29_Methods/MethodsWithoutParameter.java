package day29_Methods;

public class MethodsWithoutParameter {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Vadym");
        printHello5Times();
        System.out.println("Gymnazium");
        printHello5Times();
        System.out.println("Print out even numbers");
        MethodsWithoutParameters2.evenNumbersTill100();
        System.out.println("Print out add numbers");
        MethodsWithoutParameters2.oddNumbersTill100();



    }

    public static void printHello5Times() {

        for (int i=1; i<=5; i++)

            System.out.println("hello");
    }


}
