package ExceptionHandling;


public class DefaultExceptionHandling1 {
    public static void doStuff(){
        doMoreStuff();                         //abnormal termination
    }
    public static void doMoreStuff(){
        System.out.println(10/0);              //No handling Code==> therefore Exception
    }
    public static void main(String[] args) {     //abnormal termination

        doStuff();                              //abnormal termination
    }
}
