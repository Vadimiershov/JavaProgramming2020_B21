package day28_MultiDimensionalArray;

public class TwoDimensionalArray2 {

    public static void main(String[] args) {

        int[][]arr2D = {{1,2,3,4},{5,6,7,8},{9,10,21,23},{45,76,34,45},{32,56,78,89,3}};

        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for(int[] eachArr:arr2D){

            for(int eachElement:eachArr){
                if(max<eachElement)
                    max = eachElement;
                if(min>eachElement)
                    min = eachElement;
            }
        }
        System.out.println(max+" "+min);
    }


}
