package day21_While_DoWhile;

public class
WordCount {

    public static void main(String[] args) {

        String phrase = "I will go to the gym tomorrow and will study Java.";
        String trimmedPhrase = phrase.trim();
        int countOfSpace = 0;

        for(int i=0; i<trimmedPhrase.length();i++){
            if(trimmedPhrase.charAt(i)==' ')
                countOfSpace++;
        }
        System.out.println(++countOfSpace);

    }



}
