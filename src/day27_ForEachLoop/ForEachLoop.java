package day27_ForEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {
        
        String[]names = {"Delaram","Aysel","Snoop","Ayse","Erjon"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("===================================================");

        for (String each:names){
            System.out.println(each);
        }
        System.out.println("==================================================");
        int[]numbers = {1,2,3,4,5,6,7,8,9,10};
        int countEvens = 0;
        int countOdds = 0;
        for (int each:
             numbers) {
            if(each%2==0){
                countEvens++;
            }else {
                countOdds++;
            }
        }
        System.out.println("Count Evens:"+countEvens);
        System.out.println("Count Odds:"+countOdds);
        System.out.println("================================================");

        int[]scores = {10,2,3,25,5,100,-5,-2,1000,30,40,56};
        int max = scores[0];
        int min = scores[0];

        for(int each:scores){
            if(max<each){
                max=each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    
    
}
