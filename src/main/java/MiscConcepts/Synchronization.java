package MiscConcepts;

class Institute {
//    synchronized public void classRoom(String facultyName) {                  //no static synchronized
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " Class taken by " + facultyName);
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//        }
//    }

    synchronized public static void classRoom(String facultyName) {                  //static synchronized
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Class taken by " + facultyName);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
//    public void exam(){
//        for (int i =1; i<=10;i++){
//            System.out.println(i + "writing " + Thread.currentThread().getName());    // to know which thread is executing
//        }
//    }

//   synchronized public static void exam(){              //synchronized statice method
//        for (int i =1; i<=10;i++){
//            System.out.println(i + "writing " + Thread.currentThread().getName());    // to know which thread is executing
//        }
//    }
//}
//public static void exam(){                  //static non synchronized method
//    for (int i =1; i<=10;i++){
//        System.out.println(i + "writing " + Thread.currentThread().getName());    // to know which thread is executing
//    }
//}
    public  void exam(){                  //non static non synchronized method
        for (int i =1; i<=10;i++){
            System.out.println(i + "writing " + Thread.currentThread().getName());    // to know which thread is executing
        }
    }
}


class MyInstituteThread extends Thread {
        Institute i;
        String facName;

        public MyInstituteThread(Institute it, String facultyName) {
            this.i = it;
            this.facName = facultyName;
        }

        @Override
        public void run() {
            i.classRoom(facName);
//            i.exam();
        }
    }

    public class Synchronization {
        public static void main(String[] args) {

            Institute it = new Institute();
            MyInstituteThread t1 = new MyInstituteThread(it, "Aditya");
            MyInstituteThread t2 = new MyInstituteThread(it, "Aryan");
            t1.start();
            t2.start();
            it.exam();
        }
    }
