package day19_ForLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        System.out.println("Hello");

        for(int i=1; i<=25; i++){
            System.out.println("hello");
        }

        System.out.println("========================================================================");

        for(int i = 5; i>0; i--) {
            System.out.println("Vadym");
        }

        System.out.println("==========================================================================");


        for(int i = 0;i<=1000; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("=================================================================");

        for(int i=100; i<=200; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("=====================================================================");

        for (int i =1; i<=100;i+=2 ) {
                System.out.print(i+" ");

        }
        System.out.println();

        System.out.println("=======================================================================");

        for(int i=0; i <= 100; i+= 2){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("=========================================================================");

        for (int i = 0; i <= 100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }


}
