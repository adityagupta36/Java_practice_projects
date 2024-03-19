package Strings;

public class StringSplitMethod {
    public static void main(String[] args) {


        String s = "Rahul Shetty Academy";

        String[] splittedString = s.split(" ");

       // System.out.println(splittedString[0]);                    //--> Rahul, Shetty , Academy

        String[] splittedString1 = s.split("Shetty");

        System.out.println(splittedString1[0]);

        System.out.println(splittedString1[1]);

        System.out.println(splittedString1[1].trim());         //trim() -->  removes all the leading and trailing spaces in the string

        System.out.println(s);

        for ( int i = s.length() - 1; i >= 0; i--) {
                System.out.println(s.charAt(i));              //returns character at specific method in a String

        }
        System.out.println(s.length());
    }
}
