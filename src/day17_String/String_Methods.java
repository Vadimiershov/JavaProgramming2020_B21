package day17_String;

public class String_Methods {

    public static void main(String[] args) {

        String str = "jira";
        String str2 = new String("jira");

        System.out.println(str == str2); //false
        System.out.println(str.equals(str2)); //true

        System.out.println(str.equalsIgnoreCase("Jira"));

        boolean item = (str.equals("jira"))|| (str.equals("Jira"));


    }


}
