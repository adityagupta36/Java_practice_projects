package MiscConcepts;

import java.util.AbstractCollection;

final class Account {
    double balance = 10000;

    synchronized public void withdraw(double w_amt) {
        System.out.println("withdraw process starts");
        System.out.println("before withdraw " + balance);
        if (balance < w_amt) {
            System.out.println("waiting for insufficient balance, waiting for deposit");

            try {
//                wait(5000);
                wait();
            } catch (InterruptedException e) {

            }
        }
        balance=balance-w_amt;
        System.out.println("after withdraw "+ balance);
    }


    synchronized public void deposit(double d_amt){
        System.out.println("deposit process starts");
        System.out.println("before deposit " + balance);
        balance = balance+d_amt;
        System.out.println("after deposit " + balance);

        notify();
//        notifyAll();
    }
}

//class AccountThread1 extends Thread{               //commented since we have used anonymous inner class
//    Account ac;
//    public AccountThread1(Account acc) {
//        this.ac=acc;
//    }
//
//    public void run(){
//        ac.withdraw(15000);
//    }
//
//}
//
//class AccountThread2 extends Thread{
//    Account ac;
//    public AccountThread2(Account acc){
//        this.ac=acc;
//    }
//    public void run(){
//        ac.deposit(10000);
//    }
//}
public class InterThreadCommunication {
    public static void main(String[] args) {
//         Account acc = new Account();
//        AccountThread1 t1 = new AccountThread1(acc);
//        t1.start();
//        AccountThread2 t2 = new AccountThread2(acc);
//        t2.start();

        Account acc = new Account();              // can also be done using Anonymous inner class
       new Thread(){
            public void run(){
                acc.withdraw(5000);
            }
        }.start();
       new Thread(){
            public void run(){
                acc.deposit(10000);
            }
        }.start();

    }
}
