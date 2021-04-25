package day30_Methods;

public class ReturnMethods2 {

    public static void main(String[] args) {

        String names = "racecar";

        String reverse = reverseStr1(names);
        boolean isPalindrome = names.equals(reverse);
        System.out.println(isPalindrome);

    }

    public static String reverseStr1(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;

    }


}
