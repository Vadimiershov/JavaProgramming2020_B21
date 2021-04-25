package day33_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {

        String str = "a1b2c3d4";

        int sum = 0;

        for (char each: str.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }

        System.out.println(sum);
        System.out.println("========================================================================================");

        String password = "Password#7";
        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChar = "";

        for (char each: password.toCharArray()) {
            if(Character.isUpperCase(each)){
             upperLetters += each;                                            //verify if the letter is upper case
            }else if(Character.isLowerCase(each)){
                lowerLetters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println(upperLetters);
        System.out.println(lowerLetters);
        System.out.println(digits);
        System.out.println(specialChar);

        boolean isValid = password.length()>= 8 && upperLetters.length()>0 &&lowerLetters.length()>0
                && digits.length()>0 && specialChar.length()>0;

        System.out.println(isValid);
    }


}
