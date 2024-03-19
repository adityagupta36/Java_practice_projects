package Exceptions;

import java.util.Scanner;

public class HandlingSpecificExceptions {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int index = sc.nextInt();

        System.out.println("enter the number you want to divide with");
        int number = sc.nextInt();

        try{
            System.out.println("the value at aray index entered is :" + marks[index]);
            System.out.println("the value of aray-value/number is: " + marks[index]/number);
        }
//        catch (Exception e){
//            System.out.println("Exception occured");
//            System.out.println(e);
//        }

        catch (ArithmeticException e){                                            //handling specific exception in java
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){                                 //handling specific exception in java
            System.out.println("ArrayIndexOutOfBoundException occured");
            System.out.println(e);
        }
        catch (Exception e){                                                      //handling specific exception in java
            System.out.println("Some other Exception occured");
            System.out.println(e);
        }

    }
}
