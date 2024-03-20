package ExceptionHandling;
public class RuntimeStackMechanism {
    public static void doStuff(){       //control comes here==> once completed==>dostuff() entry from RTS will be removed
        doMoreStuff();                 //will be executed and 1 more entry inRTS
    }
    public static void doMoreStuff(){      //control comes here==> once completed==>domorestuff() entry from RTS will be removed

    }

    //control comes here==> once completed==>main() entry from RTS will be removed
    //once all method from RTS emptied, JVM will destroy RTS and then main thread will be terminated.
    public static void main(String[] args) {              //main thread will call main method==>JVM will create 1 main method() entry in Runtime Stack
        //control comes here==> once completed==>dostuff() entry from RTS will be removed
        doStuff();      //will be executed by main thread==> 1 more entry in RTS
    }
}

