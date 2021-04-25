package day18_StringPractice;

public class StringMethods3 {

    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool";

        sentence = sentence.replace("Java", "Python");
        System.out.println("sentence = " + sentence);

        String email = "CybertekSchool@gmail.com";
        email = email.replace("gmail","yahoo");
        System.out.println("email = " + email);
        
        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students are awesome";
        
        essay = essay.replace("Batch 20","Batch 21");
        System.out.println("essay = " + essay);
        
        String r = "Cat is friendly, Cat is cute";
        r = r.replaceFirst("Cat","Dog");

        System.out.println("r = " + r);

        String t = "I like Java, because Java is cool, Java is powerful";

        t =t.replaceFirst("Java is", "Python is").replaceFirst("Java i","C# i");


        System.out.println("t = " + t);

        String a = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";

        a =a.replaceFirst("as Monday","as Sunday").replaceFirst("e Monday", "e Tuesday");
        System.out.println("a = " + a);
        
        String emailAddress = "Cybertek_School@gmail.com";
        int beginningIndex = emailAddress.indexOf("@");
        int endingIndex = emailAddress.indexOf(".");
        
        String domain = emailAddress.substring(beginningIndex+1,endingIndex);

        System.out.println("domain = " + domain);

        String p  = "I like to watch movies and reading books";

        String word2 = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println("word2 = " + word2);
        
        String y = "I like to learn Java, Java is cool, I like to watch Jumanji";
        
        int n1 = y.indexOf("Java ");
        System.out.println("n1 = " + n1);
        
        int n2 = y.lastIndexOf("J");
        System.out.println("n2 = " + n2);



    }


}
