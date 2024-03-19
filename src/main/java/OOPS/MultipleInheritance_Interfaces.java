package OOPS;
interface Parent1{
    void m1();
}
interface Parent2 {
    void m1();
}
class Child implements Parent1, Parent2{
    @Override
    public void m1() {                                        //ONLY ONE IMPLEMENTATION IS THERE ==> Multiple Inheritance
        System.out.println("in child B METHOD");

    }
}
public class MultipleInheritance_Interfaces {
    public static void main(String[] args) {
        Parent1 pa = new Child();
        pa.m1();

    }
}
