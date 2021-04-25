package day23_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for(int j = 1; j <= 5; j++){
            for (int i = 1; i <= 10; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("=========================================================================================");

        for (int k = 0; k<=10; k++) {
            for (int i = 1; i <= 7; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
