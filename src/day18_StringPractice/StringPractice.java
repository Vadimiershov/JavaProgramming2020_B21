package day18_StringPractice;

public class StringPractice {

    public static void main(String[] args) {

        String str = "cybertek";
        str = str.toUpperCase();
        System.out.println(str);

        str = str.toLowerCase();


        System.out.println(str);
        System.out.println("============================================================================");

        String name = "Vadym Iershov";
        int n1 = name.length();
        System.out.println(n1);

        String name2 = "Muhtar";

        int n2 = name2.length()-3;
        System.out.println(n2);

        System.out.println("================================================================================");

        String a = "Cybertek School";

        char firstChar = a.charAt(0);
        char lastChar = a.charAt(a.length()-1);
        System.out.println("First character is: "+firstChar+" last "+lastChar);

        System.out.println("==============================================================================");

        String b = "Today is Monday";

        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-1-1);
        System.out.println("secondLastChar = " + secondLastChar);
        System.out.println("secondChar = " + secondChar);


    }
    

}
