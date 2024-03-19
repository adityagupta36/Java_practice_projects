package MultiThreading;
class SL extends Thread{
}

public class Sleep {
    public static void main(String[] args)  throws InterruptedException {
        SL s = new SL();
        for (int i=0; i<=10; i++){
            System.out.println("Main thread");
          Thread.sleep(1000);

            /*try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            }*/
        }
    }
}
