package OOPS;
class M{
    static void m1(){
        System.out.println("Parent");
    }
}
class H extends M{
    static void m1(){
        System.out.println("Child");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        M m = new M();
        m.m1();

        H h = new H();
        h.m1();

        M mh = new H();
        mh.m1();                   // Method Hiding ==> since static method cant be overridden
    }
}

/*
Method Hiding::
1. Both parent and child class method has to bes static
2.Method Resolution always takes care by compiler based on reference type
3.Method hiding is Compile tu=ime polymorphism or static poly or early binding
 */
