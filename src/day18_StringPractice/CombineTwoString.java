package day18_StringPractice;

public class CombineTwoString {

    public static void main(String[] args) {

        String s1 = "one";
        String s2 = "eight";

        if(s1.charAt(s1.length()-1)== s2.charAt(0)){  // if the last character of first string equal to last char at second string
            System.out.println(s1+s2.substring(1));
        }else {
            System.out.println(s1+s2);
        }

        System.out.println("================================================================================");

        if(s1.endsWith(s2.substring(0,1))){
            System.out.println(s1 + s2.substring(1));
        }else {
            System.out.println(s1 + s2);
        }




    }


}
