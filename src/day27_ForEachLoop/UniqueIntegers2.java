package day27_ForEachLoop;

public class UniqueIntegers2 {

    public static void main(String[] args) {

        int[]arr = {1,1,2,3,3,4,1};

        for (int each2: arr) {


            int count = 0;

            for (int each :
                    arr) {
                if (each == each2) {
                    count++;
                }
            }

            if(count==1){
                System.out.print(each2+" ");
            }

        }
    }



}
