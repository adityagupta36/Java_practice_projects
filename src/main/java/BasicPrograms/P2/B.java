package BasicPrograms.P2;
import BasicPrograms.P1.A;

public class B extends A{

    public static void main(String[] args) {

        B b = new B();    //COMPULSORILY Child reference only to access protected method of Parent of Outside package
        b.m1();           //access protected method from another package
        System.out.println(b.age);
    }
}
