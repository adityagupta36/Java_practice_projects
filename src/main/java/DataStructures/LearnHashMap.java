package DataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class LearnHashMap {
    public static void main(String[] args) {

        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("Aditya",1);
        hm.put("Akash",11);
        hm.put("Aman",111);
        hm.put("Anand",1111);
        hm.put("Atmiya",11111);

        System.out.println(hm.get("Anand"));

//        System.out.println(hm);

       Set  set =  hm.entrySet();         //each key and value will be hold as a Set

        Iterator i = set.iterator();       //Iterating over the sets

       /* while (i.hasNext()){
            System.out.println(i.next());         //it will print both key and value as a PAIR
        }*/

        while (i.hasNext()){

           Map.Entry mp = (Map.Entry)i.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }



    }
}
