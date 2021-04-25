package day27_ForEachLoop;

public class ReverceString {

    public static void main(String[] args) {

        String[]names = {"Delaram","Aysel","Snoop","Ayse","Erjon"};

        for (String eachName:
             names) {
            String reversedName = "";
            for(int i= eachName.length()-1;i>=0;i--){
                reversedName+= eachName.charAt(i);
            }
            System.out.println(reversedName);
        }

    }



}
