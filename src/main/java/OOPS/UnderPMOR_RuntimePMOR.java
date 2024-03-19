package OOPS;
class Animall{
   void eat(){System.out.println("eating...");}
}
class Dogg extends Animall{
    void eat(){System.out.println("eating bread...");}
}
class Catt extends Animall{
    void eat(){System.out.println("eating rat...");}
}
class Lionn extends Animall{
    void eat(){System.out.println("eating meat...");}
}
public class UnderPMOR_RuntimePMOR {
    public static void main(String[] args) {
        Animall a1 =new Dogg();
        a1.eat();                           //which method to call decided by JVM==>Runtime polymorphism(method overriding)
       Animall a2 =new Catt();
        a2.eat();
        Animall a3=new Lionn();
        a3.eat();
    }
}
