package day11_MultiBranchIf;

public class LargestNumber {

    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        int n3 = 7;

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is the max number");
        }else if(n2 > n1 && n2 > n3 ){
            System.out.println(n2 + " is the max number");
        }else{
            System.out.println(n3 + " is the max number");
        }

        System.out.println("=================================================================");



    }


}
