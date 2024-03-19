package DataStructures;

import java.util.*;

public class LearnHashTable {
    public static void main(String[] args) {

        Hashtable <String , Integer> ht = new Hashtable<>();

        ht.put("Aditya",1);
        ht.put("Akash",11);
        ht.put("Aman",111);
        ht.put("Anand",1111);
        ht.put("Atmiya", 11111);


        System.out.println(ht);

        Enumeration enu_key = ht.keys();
        Enumeration enu_ele = ht.elements();

        while( enu_key.hasMoreElements()){


            System.out.println( enu_key.nextElement() + "==>" + enu_ele.nextElement());



        }









    }
}
