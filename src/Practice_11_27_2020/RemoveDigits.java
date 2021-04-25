package Practice_11_27_2020;

public class RemoveDigits {

    public static void main(String[] args) {

        String str = "abdfm#$%^&*HI12345678LJK";

        String result = "";

        for (int i = 0;i<=str.length()-1; i++){
            char each = str.charAt(i);
            if(Character.isDigit(each)){
                continue;
            }
            result += each;
        }
        System.out.println(result);


    }



}
