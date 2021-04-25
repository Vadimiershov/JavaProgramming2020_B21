package Office_Hours.Practice_10_28_2020;

public class MethodPractice2 {

    public static void main(String[] args) {
        max(100,200);
    }


    public static int max(int a, int b ){
        int maximum = (a>=b)? a : b;
        System.out.println(maximum);
        return maximum;
    }

    public static int max(int a, int b,int c){

        int n = max(max(a,b),c);
        return max(n,c);
    }

    public static int max(int a, int b, int c, int d){
       return max(max(a, b, c),d);


    }



}
