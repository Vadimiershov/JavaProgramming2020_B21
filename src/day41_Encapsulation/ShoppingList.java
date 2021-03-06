package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.addAll(Arrays.asList(
                new Item("sanitizer",15,30),
                new Item("mask",10,225),
                new Item("Watermelon",2,2.24),
                new Item("toilet paper", 20,50),
                new Item("sanitizer",15,30),
                new Item("mask",10,225)
        ));

        double total = 0;

        for(Item eachItem:items){
            total += eachItem.calcCost();
        }

        System.out.printf("total= $"+total);

    }



}
