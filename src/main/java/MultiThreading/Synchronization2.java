package MultiThreading;

class Print{
    public synchronized void printNum(){
        for (int i=0; i<=10;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
    public synchronized void printChar(){
        for (int i=0; i<=10;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}

class MyThread1 extends Thread{
    Print p ;
    public void run(){
        p.printNum();
//        p.printChar();     //this can also be the option
    }
    public MyThread1(Print p){
        this.p = p;
    }
}
class MyThread2 extends Thread{
    Print p;
     public void run(){
         p.printChar();
     }
    public MyThread2(Print p){
         this.p = p;
     }
}
public class Synchronization2 {
    public static void main(String[] args) {

        System.out.println((char)1);

        Print p = new Print();

        MyThread1 t1 = new MyThread1(p);
        MyThread2 t2 = new MyThread2(p);

//        MyThread1 t2 = new MyThread1(p);       //this can also be the option

        t1.start();
        t2.start();
    }



}
