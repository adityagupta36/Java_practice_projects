package MiscConcepts;

//creating thread using RUnnable Interface
class MyThread implements Runnable{

    @Override
    public void run() {
        //task for thread
        for (int i=0;i<10;i++){
            System.out.println("value of i is" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Mythread2 extends Thread {
    public void run() {
        for (int i = 10; i > +1; i--) {
            System.out.println("value of i is" + i);
            try {
                Thread.sleep(2000);                      //sleep method=>causes the current thread to suspend execution for a specified period
            } catch (InterruptedException e) {
            }
        }
    }
}

    public class Learn_multithreading {
        public static void main(String[] args) {               //main thread

            //create object of Mythread class
            MyThread t1 = new MyThread();                      //user created thread
            Thread t = new Thread(t1);
            t.start();

            //object of another thread
            Mythread2 t2 = new Mythread2();
            t2.start();
        }
    }

