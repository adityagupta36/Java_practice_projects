package MultiThreading;
class Interupt extends Thread{
    public void run(){
    try {
        for (int i = 0; i <= 20; i++) {
            System.out.println("I am a lazy thread");//will try to implement the method
            Thread.sleep(1000);
        }
    }catch (InterruptedException e) {             //if not then catch block will implement
        System.out.println("I got interuupted");
    }
}

}
public class ThreadInterruption {
    public static void main(String[] args) {

        Interupt i = new Interupt();
        //till here main thread
        i.start();  //till here 2 thread- main and child thread  //main thread will execute i.start()
        i.interrupt();  //main thread calls interrupt method on child thread
    }
}
