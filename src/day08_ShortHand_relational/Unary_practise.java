package day08_ShortHand_relational;

public class Unary_practise {

    public static void main(String[] args) {

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        //      -100 + 102 - 102 * 101 % 2
        System.out.println(b);


    }


}
/*
manually calculate the following code fragements:
                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2
 */