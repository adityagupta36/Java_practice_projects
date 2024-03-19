package BasicPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();

//        System.out.println(word.length());

        for (int i =word.length()-1; i>=0; i-- ){
            System.out.print(word.charAt(i));
        }
    }
}
