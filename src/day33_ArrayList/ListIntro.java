package day33_ArrayList;
import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<>();

        scores.add(100);  //autoboxing
        scores.add(90);
        scores.add(80);   //autoboxing


        System.out.println(scores.toString());

        ArrayList<String>groceryList = new ArrayList<>();

        groceryList.add("Apples");
        groceryList.add("Rice");
        groceryList.add("Meat");
        groceryList.add("Bread");

        groceryList.add(0,"Toilet paper");
        groceryList.add(1,"Sanitizer");
        groceryList.add(1,"N95 Masks");

        System.out.println(groceryList);

        int total = groceryList.size();
        System.out.println(total);

        System.out.println(groceryList.get(groceryList.size()-1));




    }



}
