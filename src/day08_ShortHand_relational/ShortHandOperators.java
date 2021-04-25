package day08_ShortHand_relational;

public class ShortHandOperators {

    public static void main (String[] args){

        int a = 10;

        System.out.println(a);

        a = 30;

        System.out.println(a);

        int x = 100;
            x -= 62; // x =  x - 62

        System.out.println(x);

        double salary = 100000;  //0.28
               salary -= (salary * 0.28);

        System.out.println(salary);

        int x2 = 999999;
            x2 -= 25;

        System.out.println(x2);

        double balance = 2000;

               balance -= 250;

        System.out.println(balance);

        String name = "Cybertek";
               name += " School";
        System.out.println(name);

        double totalTax = 100000;
               totalTax *= 0.28;
        System.out.println(totalTax);

        int bonus = 5000;
            bonus *= 3;
        System.out.println(bonus);


    }


}
