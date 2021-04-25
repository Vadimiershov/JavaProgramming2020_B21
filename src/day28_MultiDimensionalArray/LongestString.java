package day28_MultiDimensionalArray;

public class LongestString {

    public static void main(String[] args) {

        String[] names = {"javid","Sayyohat","Maryam","Awslkfledf","CJ"};

        String longest = names[0];
        String shortest = names[0];

        for(String each : names){
            if(longest.length()<each.length()){
                longest = each;
            }
            if(shortest.length()>each.length()){
                shortest = each;
            }

        }

        System.out.println("longest: "+longest);
        System.out.println("shortest: "+shortest);

    }



}
