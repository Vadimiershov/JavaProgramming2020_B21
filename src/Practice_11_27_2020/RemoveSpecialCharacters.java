package Practice_11_27_2020;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str = "ab!cd#ef%g^&hjkl&*123456";

        String result = "";

        for(char each :str.toCharArray())
            if(Character.isLetterOrDigit(each))
                result+= each;

        System.out.println(result);

    }



}
