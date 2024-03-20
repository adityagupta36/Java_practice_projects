package ExceptionHandling;

public class CheckedException_InterruptedException {
    public static void main(String[] args)  throws InterruptedException {

        System.out.println("hello now i will sleep");


//        if not handled: java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
        //checked by compiler
        Thread.sleep(1000);

//        can be handled using try-catch or using throws keyword
      /*  try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }*/
    }
}
