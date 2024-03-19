package MultiThreading;
class Show{
    public void wish(String name){
        //Thousands of line of code
        //Thousands of line of code
        //Thousands of line of code

//       synchronized (Show.class){
           synchronized (this){
           for(int i=0; i<=10 ;i++){
               System.out.println("Good Morining" + " " + name);
               try{
                   Thread.sleep(1000);
               }
               catch (InterruptedException e){

               }
           }
       }
        //Thousands of line of code
        //Thousands of line of code
        //Thousands of line of code
    }
}

class MyThreads extends Thread{
    Show s ;

    String name;

   public MyThreads(Show s , String name){
        this.s=s;
        this.name=name;
    }

    public void run(){
       s.wish(name);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {

        //Lock of current object
/*        Show s = new Show();
        MyThreads t1 = new MyThreads(s,"Aditya");
        MyThreads t2 = new MyThreads(s,"Akash");

        t1.start();
        t2.start();*/


/*        Show s1 = new Show();
        Show s2 = new Show();
        MyThreads t1 = new MyThreads(s1,"Aditya");
        MyThreads t2 = new MyThreads(s2,"Akash");

        t1.start();
        t2.start();*/


        Show s1 = new Show();
        Show s2 = new Show();
        MyThreads t1 = new MyThreads(s1,"Aditya");
        MyThreads t2 = new MyThreads(s2,"Akash");

        t1.start();
        t2.start();

    }
}
