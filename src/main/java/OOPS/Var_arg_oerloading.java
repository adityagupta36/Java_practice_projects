package OOPS;
class P{
    public void m1(int...i){              //varargs
        System.out.println("Parent");
    }
}
class C extends P{
    public void m1(int i){                //same method sign but diff parameter==> therefore not over riding its method overloaidng==>therefore Method resolution bsed on Reference type by compiler
        System.out.println("Child");
    }
}
public class Var_arg_oerloading {
    public static void main(String[] args) {
        P p = new P();
        p.m1(10);

        C c = new C();
        c.m1(20);

        P pc = new C();
        pc.m1(30);
    }
}
/*
//same method sign but diff parameter==>
therefore its not over riding
its method overloading==>Therefore Method resolution bsed on Reference type by compiler
 */
