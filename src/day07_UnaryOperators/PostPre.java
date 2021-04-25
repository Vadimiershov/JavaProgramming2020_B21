package day07_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {

        int x = 2;
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        System.out.println("===================================================================");
        int x2 = 2;

        System.out.println(x2++);  //2
        System.out.println(x2);   //3

        System.out.println("==================================================================");

        int x3 = 3;
        System.out.println(--x3);

        System.out.println("====================================================================");

        int x4 = 8;
        int y4 = x4--;

        System.out.println(y4); //8
        System.out.println(x4); //7

        System.out.println("====================================================================");

        int a =1;
        int b = -a-- +a++ / -a-- * --a;
        //  b = - 1 + 0 / - 1 * -1
        //  b = -1 + 0 * 1
        // b =  -1 + 0 = -1
        System.out.println(b);

        System.out.println("===================================================================");

        int A = 50;
        int B  = --A + A++ + A-- + A++ ;
        // B B = 49 + 49 + 50 + 49

        System.out.println(B);

        System.out.println("===================================================================");

        int X = 4;
        int Y = X * 4 - X++;
        //  Y = 16 - 4
        System.out.println(Y);
        System.out.println("=================================================================");

        int t= 100;
        int p = - ++t * -t-- / t++ + --t;
        //  p = - 101 * -101 / 100 + 100
        System.out.println(p);

        System.out.println("===============================================================");

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = - 20 + (-19) + 19 * 19 %2
        System.out.println(W);
        System.out.println("================================================================");

        int M = 300;
        int N = 400;

        int J = M + N - M * N + M / N;
        int U = ++M +N++ - M-- % 2 + --N%2;
        // 301 + 400 - 301%2 + 400%2
        System.out.println(J);
        System.out.println(U);
        // 300+400-300*400+300/400

    }


}
