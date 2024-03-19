package Exceptions;

public class Exceptions_TryCatchBlock {
    public static void main(String[] args) {
        int a =6000;
        int b=0;

// WITHOUT TRY
//        int c = a/b;
//        System.out.println("the result is: " + c);                    //will throw exception error-> Arithmetic Exception



// WITH TRY

        try{
            int c= a/b;
            System.out.println("the result is : " + c);             //try karega divide karneka, agr hua toh thik nahi toh exeption dega
        }
        catch(ArithmeticException e){
            System.out.println("we failed to divide. Reason");       //exception aaya tph catch active hoga aur..sout(e)->tells reason of error...
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
