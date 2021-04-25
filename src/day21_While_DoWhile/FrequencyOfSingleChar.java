package day21_While_DoWhile;

public class FrequencyOfSingleChar {

    public static void main(String[] args) {

        String str = "I like to learn java, I would love to join Cybertek";
        char ch = 'e';

        int count = 0;

        for(int i= 0; i<=str.length()-1; i++){
            char eachCharacter = str.charAt(i);
            if(ch == eachCharacter){
                count++;
            }
        }
        System.out.println(count);


    }



}
