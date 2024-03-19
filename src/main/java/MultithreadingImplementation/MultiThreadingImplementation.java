package MultithreadingImplementation;

class Company {
    int n;
    boolean f = true;
   synchronized public void producedItems(int n) throws InterruptedException {
       //f=false:chance of Producer
       //f=true: chance of Consumer
       if(!f){
           wait();
       }
        this.n = n;
        System.out.println("produced : "+ this.n);
        f=false;
        notify();
   }
    synchronized public void consumedItems() throws InterruptedException {
       if(f){
           wait();
       }
        System.out.println("consumed: " + this.n);
       f=true;
       notify();
    }
}

class Producer extends Thread{
        Company c;

        Producer(Company c){
          this.c =c;
        }
    public void run(){
            int i =1;
            while (true){                        //for infinite
                try {
                    this.c.producedItems(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                i++;

            }
    }
}

class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c =c;
    }
    public void run(){
        while (true){
            try {
                this.c.consumedItems();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreadingImplementation{
    public static void main(String[] args) {
        Company co = new Company();
        Producer p = new Producer(co);
        Consumer c = new Consumer(co);
        p.start();
        c.start();

    }
}