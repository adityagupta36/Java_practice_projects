package OOPS;

class Test {
    public static void m1(){                                       //this static method cant participate in METHOD-OVERRIDING
        System.out.println("this is Super class m1() method");
    }
}

class ReTest extends  Test{
    public static void m1(){                                      //this static method cant participate in METHOD-OVERRIDING
        System.out.println("this is SUB class m1() method");
    }
}
public class CompiletimePoly {

    public static void main(String[] args) {
        Test t = new ReTest();
        t.m1();                                      //Here, compiler bind m1() at compile time with Super Class(Parent Reference)
    }

}
/*
//Here, compiler bind m1() at compile time with Super Class(Parent Reference)
//this static method cant participate in METHOD-OVERRIDING
//static methods are not associated with the instance of a class, but with the class itself.
//JVM will also executes the same method at runtime ==> Compile time/static polymorphism/Early binding
 */