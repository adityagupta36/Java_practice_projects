package ExceptionHandling;

import BasicPrograms.P1.A;

public class Try_Catch {
    public static void main(String[] args) {

        System.out.println("Stmet 1");

        System.out.println(5/0);     //this is abnormal termination: since outside try catch block


//if not handled
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at ExceptionHandling.Try_Catch.main(Try_Catch.java:8)
// risky code
try{
    System.out.println(10/0);      //risky code  //normal termination  //tryblock  ==>  //part of main flow   //if exception occurs here, next main flow will not be executed
    System.out.println(10/5);                 //tryblock ==>   //part of main flow
}

//        Handling Code
catch (ArithmeticException e){        //if no exception, catch block not executed   //always associated with try
    System.out.println(10/2);
    System.out.println(7/0);           //abnormal termination
}
        System.out.println("Stmt 3");
    }
}
