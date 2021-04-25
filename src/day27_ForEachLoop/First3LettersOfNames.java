package day27_ForEachLoop;

public class First3LettersOfNames {

    public static void main(String[] args) {

        String[]names = {"Delaram","Aysel","Snoop","Ayse","Erjon"};
        String subNames = "";
        for (String each:
             names) {
            subNames = each.substring(0,3);
            System.out.println(subNames);
        }




    }



}
