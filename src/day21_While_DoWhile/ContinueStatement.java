package day21_While_DoWhile;

public class ContinueStatement {

    public static void main(String[] args) {

       for(int i=1; i<=3; i++){
           if(i==3){
               continue;
           }

           System.out.println(i+" ");
       }
        System.out.println("==================================================================================");

       for (int i = 1; i<=50; i++){
           if(i%2==0){
               continue;
           }
           System.out.print(i+" ");
       }
        System.out.println("====================================================================================");

       for(int i=1; i<=50; i++){
           if(i%2!=0){
               continue;
           }
           System.out.print(i+" ");
       }
        System.out.println("=====================================================================================");

       for(int i =1; i<=50; i++){
           if(i%3!=0){
               continue;
           }
           System.out.print(i+" ");
       }
    }



}
