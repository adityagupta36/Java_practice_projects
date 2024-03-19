package BasicPrograms.P1;

public class A {

    protected int age=26;
    protected void m1(){
        System.out.println("A class Protected Method");
    }

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.age);
    }
}
