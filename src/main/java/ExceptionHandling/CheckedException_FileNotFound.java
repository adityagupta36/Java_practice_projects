package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException_FileNotFound {
    public static void main(String[] args) throws FileNotFoundException {

        //if not handled==>FileNotFoundException==> therefore has to ba handled using throws FileNotFoundException
        //java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
//        checked by compiler
        PrintWriter fw = new PrintWriter("abc.text");  //

        fw.println("hello");
    }
}
