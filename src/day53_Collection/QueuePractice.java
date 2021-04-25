package day53_Collection;

import java.util.*;

public class
QueuePractice {

    public static void main(String[] args) {
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 12, 9, 8, 7, 11, 23, 54, 53));
        System.out.println(arrayDeque);
        int i = arrayDeque.poll(); //remove 10
        arrayDeque.poll(); //12
        System.out.println(i);
        System.out.println(arrayDeque);

        int num1 = (Integer) ((ArrayDeque) arrayDeque).getFirst();
        System.out.println(((ArrayDeque) arrayDeque).getLast());
        System.out.println("===========================================================");

        Queue<Integer> linkedList = new LinkedList<>(); //accept null
        linkedList.addAll(Arrays.asList(10, 12, 9, 8, 7, 11, 23, 54, 53));
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);

        System.out.println(((LinkedList<Integer>) linkedList).get(0));
        System.out.println(((LinkedList<Integer>) linkedList).get(linkedList.size()-1));

        System.out.println("=============================================================");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 12, 9, 8, 7, 11, 23, 54, 53));
        System.out.println(priorityQueue);


    }
}
