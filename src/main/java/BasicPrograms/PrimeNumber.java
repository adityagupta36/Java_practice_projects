package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n/2; i++) {
            if (n%i==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime==false){
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }
}