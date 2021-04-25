package day10_IfElseStatement;

public class EvenTernaryConditionalOperator {

    public static void main(String[] args) {

        int number = 0;



        boolean even = number % 2 == 0;
        boolean odd = !even ;
        //ternary conditional operator


        String evenodd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " +evenodd);


        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        boolean pos = n1 == 1 ? n2 ==2 : n3 ==3;
        System.out.println(pos);

    }
}
