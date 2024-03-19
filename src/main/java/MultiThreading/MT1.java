package MultiThreading;

class MyThread extends Thread{
    //no arg method will be called by t.start()
    // JOB of child thread
    // executed by child thread
    //: if run() not over ridded in My Thread, then JVM will internally call Thread class run() method which has empty implementation

    public void run(){
        Thread.currentThread().setName("+ My Thread +");
        for(int i =0 ; i<100 ; i++){
            System.out.println("Child Thread no arg method"+ " " + "Name of thread is "+ Thread.currentThread().getName());
        }
    }


    //Over riding start() method
    //Here start() method of  will be called explicitly like a normal method call and no new thread will be created
/*        public void start(){
        super.start();
        System.out.println("Start method");
    }*/

/*    public void run(int i) {
        System.out.println("overloading run method - arg method");
    }*/
}
public class MT1 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());        //main


        //thread instantiation
        MyThread t = new MyThread();

        Thread.currentThread().setName("Aditya Thread");
        System.out.println(Thread.currentThread().getName());       //Aditya

        Thread t1 = new Thread(t);
//        t1.start();


//          start thread: a separate new thread created will be responsible to execute the job
       t.start();     //will call no arg run() method

//        t.start();     //t.start() invoke multiple times: Runtime exception==>IllegalThreadStateException

        //t.run() total o/p produced by only main thread
//        t.run(100);

        for (int i =0; i< 100; i++){              //executed by main thread
            System.out.println("Main thread"+ " " + Thread.currentThread().getName());
        }
    }
}
