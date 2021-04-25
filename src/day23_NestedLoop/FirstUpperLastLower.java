package day23_NestedLoop;

public class FirstUpperLastLower {

    public static void main(String[] args) {

        String str = "Cybertek";

        char f = str.charAt(0);
        char l = str.charAt(str.length()-1);

        boolean start = f >= 65 && f <= 90;
        boolean end = l >= 97 && l <= 122;

        if(start && end){
            System.out.println("True");
        }else {
            System.out.println("False");
        }



    }


}
