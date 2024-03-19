package MultiThreading;
class MyRunnable extends Thread implements Runnable{

    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

public class MT2 {
    public static void main(String[] args) {

//        System.out.println(Thread.currentThread().getName());


        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
//        Thread t2 = new Thread();

        t1.start();

        for (int i =0; i< 100; i++){              //executed by main thread
            System.out.println("Main thread");
        }

    }
}
