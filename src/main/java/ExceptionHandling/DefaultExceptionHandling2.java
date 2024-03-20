package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DefaultExceptionHandling2 {

    public static void doStuff(){                                //abnormal termination
        doMoreStuff();
        System.out.println(10/0); //ArithmeticException


    }
    public static void doMoreStuff(){                             //normal termination
        System.out.println("Jay Swaminarayan Das Na Das");
    }


    public static void main(String[] args) throws FileNotFoundException{

        doStuff();


    }
}
