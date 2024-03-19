package Strings;

import java.util.Scanner;
import java.util.*;

public class Strings {
    public static void main(String[] args) {

        // String name = "Aditya";
        // System.out.println("the name is: " + name);
//        int a = 6;
//        float b =5.6454f;
//        System.out.printf("the value of a is %d and value of b is %8.2f",a,b);  // very important step
//        // System.out.format("the value of a is %d and value of b is %f",a,b);  // very important step
//        Scanner sc = new Scanner(System.in);
//        // String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

//         String str ="Aditya";          // creating string using literal
//         String s=new String("AdityaGupta");  // we can also create string using new
//         System.out.println(str + s);
//




        //compareTo
//        String firstname = "tony";
//        String lastname = "tony";
//
//        if(firstname.compareTo(lastname)==0){            //can also use->  if( firstname==lastname)
//            System.out.println("strings are equal");
//        }
//        else System.out.println("strings are not equal");


/*        //substring
        String sentence = "My name is tony stark";
        String name= sentence.substring(0,11);
        System.out.println(name);


        //charAT
        for(int i =0; i<sentence.length(); i++){
            System.out.print(sentence.charAt(i));
        }
*/


        // String Builder concept
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(1);
        System.out.println(sb);
        System.out.println(2);;
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        System.out.println(3);
        sb.insert(0, 'S');
        System.out.println(4);
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(5);
        System.out.println(sb);
        sb.append('e');          //adds in last
        System.out.println(6);
        System.out.println(sb);

        StringBuilder ss = new StringBuilder("Adityagupta");
//        System.out.println(ss.delete(4, 9));   // sout==> Aditta
        System.out.println(ss.delete(3, 4));     //sout==>  Adiyagupta
        System.out.println(ss.replace(3, 5, "dasnadas"));               //sout==>  Adidasnadasgupta

        System.out.println(ss.append("HELLO"));         //char can be added in end







    }
}
