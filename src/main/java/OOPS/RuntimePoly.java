package OOPS;
class A{
    int a =5;             //non static variable
    public void m1(){        //non static method
        System.out.println("this is super class method m1()");
    }
}

class B extends A{
    int a =10;

    public void m1(){           //overide nonstaic method
        System.out.println("this is sub class method m1()");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {

        A o = new B();
        o.m1();                      //HERE, Compiler bind SuperClass m1() at compile time   //RUNTIME POLY==>>JVM at Runtime takes its own decision and calls the latest updated method(only if that non static method(FROM SUPERCLASS) is overrided (to SubClass)
        System.out.println(o.a);

        /*
        1. Both parent and child class method has to be nonstatic.
        2.Method resolution is done by JVM based on Runtime object
        3.LateBinding/dynamic poly/RUNTIME POLY
         */

        /*
         // Whatever the decsion taken by the compiler at compile time, the same decision is not implemented by the JVM at Runtime
         //HERE, Compiler bind SuperClass m1() at compile time
         //LateBinding/dynamic poly/RUNTIME POLY==>>JVM at Runtime takes its own decision and calls the latest updated method(only if that non static method(FROM SUPERCLASS) is overrided (to SubClass)
         */


    }
}


