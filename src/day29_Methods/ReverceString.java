package day29_Methods;

public class ReverceString {

    public static void main(String[] args) {

        reverse("Cybertek");

        String[] names = {"VAdym","Marvan","Inna","Halim","Afroz"};

        for (String each: names) {
            reverse(each);
        }

    }

    public static void reverse(String word){

        String result = "";
        for (int i = word.length()-1; i>=0; i--) {
          result +=  word.charAt(i);
        }

        System.out.println(result);

    }

}
