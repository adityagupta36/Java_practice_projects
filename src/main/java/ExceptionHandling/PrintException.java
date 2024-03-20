package ExceptionHandling;

public class PrintException {
    public static void main(String[] args) {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){

//            Complete info: Name of exception, description of exception, Stack trace
//            e.printStackTrace();                  //java.lang.ArithmeticException: / by zero
//                                                //at ExceptionHandling.PrintException.main(PrintException.java:7)

            System.out.println(e.toString()); //name and description of exception  //java.lang.ArithmeticException: / by zero

//            only description/message
//            e.getMessage();

        }
    }
}
