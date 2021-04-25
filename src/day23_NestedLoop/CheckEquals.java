package day23_NestedLoop;

public class CheckEquals {

    public static void main(String[] args) {

        String sentence = "Dog dog Dog CAT catCat";
        String cat = "cat";
        String dog = "dog";
        int catCount = 0;
        int dogCount = 0;


        String temp = sentence.toLowerCase();

        while (temp.contains(cat)){
            temp = temp.replaceFirst(cat,"");
            catCount++;
        }

        while (temp.contains(dog)){
            temp = temp.replaceFirst(dog,"");
            dogCount++;
        }
        boolean result = dogCount == catCount;
        System.out.println(result);


    }



}
