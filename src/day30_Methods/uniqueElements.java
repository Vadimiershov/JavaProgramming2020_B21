package day30_Methods;


public class uniqueElements {

    public static void main(String[] args) {
        String str = "aegaaabbbbbcccddd";

        System.out.println(unique(str));
    }

    public static int frequency(String str, char ch){
        int count = 0;

        for (char eachchar: str.toCharArray()) {
            if(eachchar ==ch){
                count++;
            }
        }

        return count;
    }

    public static String unique(String str){
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = frequency(str, each);
            if(count==1)
                unique+= each;
        }
        return unique;
    }





}
