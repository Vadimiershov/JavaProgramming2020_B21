package day21_While_DoWhile;

public class SubstringMethodsPractice {

    public static void main(String[] args) {

        String email = "John_Daniel@BOfA.com";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String lastName = email.substring(0,indexOf_);
        String firstName = email.substring(indexOf_+1,indexOfAt);
        String domain = email.substring(indexOfAt,email.indexOf("."));

        System.out.println(firstName+" "+lastName+" "+domain);

    }


}
