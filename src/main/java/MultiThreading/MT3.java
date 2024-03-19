package MultiThreading;
class My_Thread extends Thread {


}
public class MT3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());   //==> 5   Default priority 5 for main() thread

//        Thread.currentThread().setPriority(15);    //Runtime exception:  illegal argument exception
        Thread.currentThread().setPriority(7);

        My_Thread t = new My_Thread();      //Parent class ==> Thread class //Parent thread ==> main() thread

        System.out.println(Thread.currentThread().getPriority());




    }


}
