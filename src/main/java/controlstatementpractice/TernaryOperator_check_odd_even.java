package controlstatementpractice;

public class TernaryOperator_check_odd_even {

    public static void main(String[] args) {

        int a=23;

        if(a%2==0){
            System.out.println("no is even");
        }
        else{
            System.out.println("odd");
        }

        int b = 44;

          String output =  (b % 2 == 0) ? "even number" : "odd number";      //ternary operator
        System.out.println(output);

    }
}
