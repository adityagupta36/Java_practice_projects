package ExceptionHandling;

import javax.crypto.spec.PSource;

public class UncheckedException_ArithmeticException {
    public static void main(String[] args) {

//Arithmetic exception: not checked by compiler
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at ExceptionHandling.UncheckedException_ArithmeticException.main(UncheckedException_ArithmeticException.java:7)
        System.out.println(10/0);
    }
}
