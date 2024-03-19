package DataStructures;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);
        System.out.println(s.pop());    //Removes the object at the top
        System.out.println(s.peek());   //Looks at the object at the top

    }
}
