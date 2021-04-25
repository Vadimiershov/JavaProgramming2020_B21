package day22_JavaRecap;

public class StringPractice3 {

    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

        sentence = sentence.replace("Canada","USA");
        System.out.println(sentence);

        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";
        s = s.replaceFirst("Cybertek", "MIT");
        System.out.println(s);

        String r = "cava is cool programming language, I can learn cava at Cybertek school";
        r = r.replace("cav","jav");
        System.out.println(r);

        String p = "I like Java and Java Java Java Java";
        p = p.replace("Java", "c#");
        System.out.println(p);

        String str = "               ";

        System.out.println(str.length());

        String str2 = "                      Cybertek          School";

        str2 = str2.trim();
        System.out.println(str2);

        String s2 = "I like to learn Java";

        System.out.println("Contains c# "+s2.toLowerCase().contains("java"));
        System.out.println(s2.equals("java"));

        String s3 = "Cybertek School is the best";
        System.out.println(s3.toLowerCase().contains("cybertek"));

        String URL = "https://www.amazon.com";

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com")|| URL.endsWith(".edu"));

        if(isValid){
            System.out.println("URL is valid");
        }else {
            System.out.println("Invalid");
        }

        String email = "Java_Masters@java.com";

        boolean validDomain = email.endsWith("gmail.com")||email.endsWith("yahoo.com")||
                email.endsWith("hotmail.com")||email.endsWith("outlook.com");

        if(validDomain){
            System.out.println("valid Email");
        }else{
            System.out.println("Invalid Email");
        }





    }



}
