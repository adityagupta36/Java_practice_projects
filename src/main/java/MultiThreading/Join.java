package MultiThreading;
class JT extends Thread{
    static Thread mt;                        //Thread class object

    public void run(){
        try {
            mt.join();                         //calling main thread to join()  //this will make child thread wait
        } catch (InterruptedException e) {
        }
        for (int i =0 ; i<=10 ; i++) {
            System.out.println("Seetha thread");
/*            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }

    }
        public class Join {
    public static void main(String[] args) throws InterruptedException {
        JT.mt = Thread.currentThread();          //calling thread class object and assigning value of current main thread
        //till here we had main() thread
        JT j = new JT();
        j.start();           //here 2 thread there: main and child  //child thread called by parent main() thread

//        j.join();

       for(int i =0; i<=10;i++){
            System.out.println("Rama Thread");
            Thread.sleep(1000);
        }

    }
}
