package DataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
    public static void main(String[] args) {



                HashSet<Integer> myhashSet = new HashSet<>(100, 0.5f);     //default initial capcity-16, default load factor-0.75        //Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and the specified load factor.

                //Inserting elements
                myhashSet.add(6);   // Adds the specified element to this set if it is not already present.
                myhashSet.add(8);
                myhashSet.add(3);
                myhashSet.add(11);
                myhashSet.add(11);            //this element will be ignored //since set will store only unique character
                System.out.println(myhashSet);

                if (myhashSet.contains(6)) {                // .contains -> used to search eleement in hashset
                    System.out.println("set contains 6");
                }
                if (!myhashSet.contains(6)) {
                    System.out.println("does not contain 6");
                }


                //Removing elements from the HashSet :
                System.out.println("myHashSet before removing any element : " + myhashSet);
                myhashSet.remove(3);                                                           //deletes 3 from the hashset
                System.out.println("myHashSet after removing a element : " + myhashSet);


                //Checking if the HashSet is empty or not :
                HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
                myhashSet.add(6);
                myhashSet.add(8);
                myhashSet.add(3);
                myhashSet.add(11);

                HashSet<Integer> myHashSet1 = new HashSet<>();

                System.out.println(myhashSet.isEmpty());
                System.out.println(myHashSet1.isEmpty());

                //Removing all the elements from the HashSet :
                HashSet<Integer> hashSet = new HashSet<>(6, 0.5f);
                hashSet.add(16);
                hashSet.add(33);
                hashSet.add(78);
                hashSet.add(19);
                hashSet.add(29);
                hashSet.add(10);

                System.out.println("myHashSet before : " + hashSet);     // ->will print the set
                myHashSet.clear();                                     //deletes all the elements from the hashset
                System.out.println("myHashSet after clear  : " + myHashSet);

                //Printing the size of the HashSet :
                System.out.println("The size of myHashSet is : " + hashSet.size());        // -> .size -> get size of hashset

                //Iterator
                Iterator<Integer> it = hashSet.iterator();                     //ITERATOR ==> Interface
                while (it.hasNext()) {                                //jab tak true ya false hai tab tak
                    System.out.print(it.next() + "  ");
                }
            }
        }


