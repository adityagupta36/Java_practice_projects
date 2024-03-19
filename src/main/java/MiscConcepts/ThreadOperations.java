package MiscConcepts;
class UserThread implements Runnable{

    @Override
    public void run() {
        System.out.println("this is user defined thread");
    }
}
public class ThreadOperations {
    public static void main(String[] args)  {
        System.out.println("program started");

        int x = 56+34;
        System.out.println("sum is : "+x);

        String t = Thread.currentThread().getName();                        //getting main thread name
        System.out.println("current running thread is : " + t);             //main thread name
        System.out.println();

        Thread.currentThread().setName("MyMainThread");                     //setting main thread name

        t=Thread.currentThread().getName();
        System.out.println(t);

        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){                                 //interupted exception = thread is waiting, sleeping, or otherwise occupied,

        }
        System.out.println(Thread.currentThread().getId());             //get Thread id

        System.out.println("program ended");

        UserThread ut = new UserThread();
        Thread th = new Thread(ut);
        th.start();                                                   //start method
    }

}
