package Exceptions;

import java.util.Scanner;

    public class ExceptionsInJava {


        public static void main(String[] args) {
            int a = 8;
            Scanner sc = new Scanner(System.in);                 //taking input
            a = sc.nextInt();                                    //taking input
            if (a < 9) {                                         // CONDITION...
                try {
               throw  new ArithmeticException("this is an exception");     //throws exception     //we can throw other exception also and pass message into it
                }
                catch (Exception e) {
                    System.out.println(e);
                e.printStackTrace();                              // gives Which Error At which line
                    System.out.println("finished");
                }
                System.out.println("yes finished");
            }



        }

}
