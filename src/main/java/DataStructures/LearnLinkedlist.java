package DataStructures;
import java.util.LinkedList;
public class LearnLinkedlist {
    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();
        l.addFirst("Name");
        l.addFirst("is");
        l.addLast("Aditya");                 //last mai add karega
        l.addFirst("My");                    //first mai add karega
        l.add("OK");                            //bydefault last mai add karega
        System.out.println(l);


        System.out.println(l.size());    //size

        //iterate print
        for (int i =0; i<l.size() ; i++){
            System.out.print(l.get(i));         //get ele at particular index
        }

        //delete
        l.removeFirst();                         //remove first index
        System.out.println(l);
        l.removeLast();                          //remove last index
        System.out.println(l);
        l.remove(2);                        //remove at particular index
        System.out.println(l);



    }
}
