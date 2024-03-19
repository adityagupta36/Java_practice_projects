package DataStructures;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq = new ArrayDeque<>();        //implements queue and deque interface

        aq.add(6);        //offer,poll,peek(First,last), no need of index, special array=> add, delete from both sides
        aq.add(56);
        aq.add(9);
        aq.addFirst(5);                    //Inserts the specified element at the front
        aq.addLast(100);                   //Inserts the specified element at the end

//        System.out.println(aq.peek());      //Retrieves, but does not remove, the head of the queue
//        System.out.println(aq.poll());      //Retrieves and removes the head of the queue
//        System.out.println(aq.pop());       //Pops an element from the stack
//        aq.removeFirst();
        System.out.println(aq);


        System.out.println(aq.getFirst());     //Retrieves, but does not remove, the first element
        System.out.println(aq.getLast());      //Retrieves, but does not remove, the last element




    }
}
