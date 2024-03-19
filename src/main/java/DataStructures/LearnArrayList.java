package DataStructures;
import java.util.ArrayList;      //import
import java.util.Collections;    //import
import java.util.*;             //use this

public class LearnArrayList {
    public static void main(String[] args) {

 /*
        The load factor for the ArrayList is 0.5F. The default initial capacity is 10.
        Load factor = 0.75 * 10 = 7. So when we try to add the 7th element to the ArrayList,
        it will create a new array double the size of the old array i.e. 20.
        */


        ArrayList<Integer> ar = new ArrayList<>();

        //1)add elements
        ar.add(1);               //add elements=> TC:O(1)
        ar.add(2);
        ar.add(3);

        System.out.println(ar);

        //2)get elements
        int n = ar.get(0);
        System.out.println(n);    // get elements at particular index==> TC:O(1)


        //3)add in bet                 //insert in bet==> TC:O(n)
        ar.add(1, 10);
        System.out.println(ar);

        //4)Set value              //set element ==>TC:O(1)
        ar.set(0, 20);
        System.out.println(ar);

        //5)del elements              //TC:O(n)
        ar.remove(3);
        System.out.println(ar);

        //6)Size
        int m = ar.size();
        System.out.println(m);

        //7)iterate                              //TC:O(n)
        for (int i=0; i<ar.size() ; i++){
            System.out.print(ar.get(i));
        }
        System.out.println();

        //8) sort array
        Collections.sort(ar);
        System.out.println(ar);

        //9) contains                     //TC:O(n)
        boolean a = ar.contains(20);
        System.out.println(a);

        //10) indexOf
        System.out.println(ar.indexOf(20));

        //11) isEmpty
        System.out.println(ar.isEmpty());


    }
}

