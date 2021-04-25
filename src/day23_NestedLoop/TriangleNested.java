package day23_NestedLoop;

public class TriangleNested {

    public static void main(String[] args) {

        for (int j = 1;j<=8;j++){
            for (int a = 1;a<=j;a++){
                System.out.print("* ");
            }
            System.out.println();
        }





        for (int k = 8; k>=1; k--) { // j: 1, 2, 3, 4, 5, 6, 7, 8
            for (int i = k; i >= 1; i--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



    }


}
