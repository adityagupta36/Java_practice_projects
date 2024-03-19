package BasicPrograms;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int a;
        int b;

        System.out.println("Enter the first two fibo no");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        for(int i =2; i<10;i++){
            int ans=a+b;
            System.out.print( ans + " ");
            a=b;
            b=ans;
        }
    }
}
