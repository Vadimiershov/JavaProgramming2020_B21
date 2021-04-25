package day21_While_DoWhile;

public class MiddleCharacter {

    public static void main(String[] args) {

        String word = "ja";

        if(word.length() % 2 !=0) {


            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else {
                System.out.println(word + word + word);
            }
        }else{
            if(word.length()>= 4){
                int m = word.length()/2;
                System.out.println(word.charAt(m-1)+""+word.charAt(m));
            }else{
                System.out.println(word+word);
            }
        }



    }



}
