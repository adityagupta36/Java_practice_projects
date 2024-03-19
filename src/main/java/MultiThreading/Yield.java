package MultiThreading;

class YT extends Thread{
    public void run(){
for( int i=0; i<=100;i++){
    System.out.println("child thread");
        Thread.yield();                   // if commented , will get mix response
}
    }
}
public class Yield {
    public static void main(String[] args) {

        YT y = new YT();
        y.start();

        for ( int i =0; i< 100; i++){
            System.out.println("Main thread");
        }
    }
}
