package Exceptions;

import java.util.Scanner;

public class NestedTryCatchLoop {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int index = sc.nextInt();
//
//        System.out.println("enter the number you want to divide with");
//        int number = sc.nextInt();


        try {
            System.out.println("welcome to this lec82");
            System.out.println(100/2);                                // this will give exception in level 1
            try {
                System.out.println(marks[index]);                     //this will give exception in level 2, if input is not proper
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this index doesnt exist");
                System.out.println("exception in level 2");
                System.out.println(e);
            }
        }
        catch (Exception e) {
            System.out.println("exception in level 1");
            System.out.println(e);
        }
    }
}
