package MultiThreading;

class Tp extends Thread{
    public void run(){
        for(int i = 0 ; i<=100 ; i++){
            System.out.println("child thread"+ " " +  Thread.currentThread().getPriority());
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        Tp tp = new Tp();

        System.out.println(Thread.currentThread().getPriority());

        tp.setPriority(10);
        tp.start();

        for (int i=0; i<=100;i++){

            System.out.println("main thread" + " " + Thread.currentThread().getPriority() );
        }
    }
}
