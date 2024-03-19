package BasicPrograms;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(; n!=0 ; n=n/10){

             int remainder = n%10;
            System.out.print(remainder);

        }

    }
}
