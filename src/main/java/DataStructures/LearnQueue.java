package DataStructures;
import java.util.*;

public class LearnQueue {
    public static void main(String[] args) {


        Queue<Integer> q = new LinkedList<>();     //Queue is a interface=> linkedlist and arraydeque implements it
//        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(6);

        System.out.println(q);
//        System.out.println(q.remove());
        System.out.println(q.poll());      //Retrieves and removes the head of this queue
        System.out.println(q.peek());      //Retrieves, but does not remove, the head of this queue,

    }

}
