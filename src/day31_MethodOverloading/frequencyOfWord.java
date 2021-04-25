package day31_MethodOverloading;

import library.StringUtility;

public class frequencyOfWord {

    public static void main(String[] args) {
        String str = "Today is a great day, today we are learning java, today we have java class ";

        int count = StringUtility.frequencyOfWord(str,"today");

        System.out.println(count);
        
        String str2 = "java JAVA c# C# c# java";
        int countJava = StringUtility.frequencyOfWord(str2,"java");
        int countCSharp = StringUtility.frequencyOfWord(str2,"c#");

        System.out.println("countJava = "+ countJava);
        System.out.println("countCSharp = " + countCSharp);

        System.out.println(" ================================================================================== ");

        String sentence = "dog dog dog dog dog dog DOG DOG DOG dog cat cat cat cat cat car";
        int countDog = StringUtility.frequencyOfWord(sentence,"dog");
        int countCat = StringUtility.frequencyOfWord(sentence,"cat");
        System.out.println(countCat==countDog);


    }

    


}
