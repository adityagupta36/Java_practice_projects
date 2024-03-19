package BasicPrograms;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        word=word.toLowerCase();           // important
        int j = word.length()-1;

        boolean ifPalindrome = false;
        for(int i=0; i<=word.length()/2;i++){
            if(word.charAt(i)==word.charAt(j)) {
                j = j - 1;
                ifPalindrome=true;
            }
            else ifPalindrome=false;
            }
        if(ifPalindrome){
            System.out.println("palindrome");
        }
        else System.out.println("not palindrome");
        }
    }

