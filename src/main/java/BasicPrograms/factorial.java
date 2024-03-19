package BasicPrograms;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int factorial =1 ;
        for (int i=n; i>0 ;i--){
           factorial=  factorial*(i);
        }
        System.out.println(factorial);
    }
}
