package day26_Arrays;

public class MinNumberInArray {

    public static void main(String[] args) {

        int [] numbers = {8,6,4,23,2,6,4,1};

        int min = numbers[0];

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println(min);

    }


}
