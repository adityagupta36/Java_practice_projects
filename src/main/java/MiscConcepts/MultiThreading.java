package MiscConcepts;

class Thread1 extends Thread{
    public Thread1(String threadName) {    // to set thread name using constructor
        super(threadName);                  //super(denotes Thread Class)=>sets Thread name in Thread Class
    }
    @Override
    public void run(){
//        if (Thread.currentThread().isDaemon()){
//            System.out.println("thread1 is daemon thread");
//        }
//        else System.out.println("its a user thread");

//        System.out.println(getName());
//        System.out.println(Thread.currentThread().getName());        //get thread name which was set by us manually


        for(int i=0; i<5; i++){
            System.out.println("inside " + Thread.currentThread().getName()+" "+ i);
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
//        for (int i = 0 ; i <5 ; i++){
//            System.out.println(Thread.currentThread() + " " + i);
//        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {          //main itself a thread=>main is a user thread

        System.out.println("main is executing");

//        Thread1 t1 = new Thread1("thread1");    //setting thread name              //user thread
//        t1.setDaemon(true);                                //set daemon thread
//        t1.start();

//        Thread2 th2 = new Thread2();
//        Thread t2 = new Thread(th2, "thread2");
//        t2.start();

        Thread2 th2 = new Thread2();
        Thread t2 = new Thread(() ->                                             //lambda expressions
        {
            for (int i = 0 ; i <5 ; i++)
                System.out.println(Thread.currentThread() + " " + i);
        }, "thread2");
        t2.start();

        System.out.println("main is exiting");

    }
}

