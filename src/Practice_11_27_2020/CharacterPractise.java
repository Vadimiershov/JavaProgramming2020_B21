package Practice_11_27_2020;

public class CharacterPractise {

    public static void main(String[] args) {

        int countSpecialChars = 0;
        int countLetters = 0;
        int countDigits = 0;



        for(int i = 1; i<=Character.MAX_VALUE; i++){
            char each = (char)i;
            if(!Character.isLetterOrDigit(each)) {
                countSpecialChars++;
            }else if(Character.isLetter(each)){
                countLetters++;
            }else {
                countDigits++;
            }
        }
        System.out.println(countSpecialChars+" "+countLetters+" "+countDigits);

    }


}
