package MultiThreading;
class Display{
//    public static synchronized void  wish(String name) {    //class level lock==> sync possible , since static synchronized
     public synchronized void  wish(String name) {
        for (int i=0; i<=10; i++){
            System.out.println("Hello" + " " + name);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
class Th extends Thread {
    String name;
    Display w ;          //to perform wish operation of wish class, you need to create object of that method

    public void run(){
        w.wish(name);
    }
    public Th(Display d , String name){
        this.name = name;
        this.w=d;
    }
}
public class Synchronization1 {
    public static void main(String[] args) {

       Display d1 = new Display();             //create object whose synchronized method has to be accessed by multiple threads
        Display d2 = new Display();            //multiple java objects of Display==> d1 and d2 ==> no need of synchronization then

        Th t1 = new Th(d1,"Dhoni");     //t1 requrires lock of d1  //multiple thread access same synchronized method  of that particular object "d"[2 dog(2 threads) one biryani plate(single java obj)]
        Th t2 = new Th(d2,"Yuvraj");         // another thread access synchronized method of another java object ==> No synchronization [2 dog(2 threads) 2 biryani plate(2 java obj)]

        t1.start();
        t2.start();

    }
}
