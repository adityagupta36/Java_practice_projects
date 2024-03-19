package MiscConcepts;

class P{
    int a = 777;
    public void m1(){
        System.out.println("Parent");
    }

    public void n1(){
        System.out.println("n1 in parent");
    }
   /* public static void n1(){
        System.out.println("n1 in parent");
    }*/
}
class Ch extends P{
    int a = 888;
    public void m2(){
        System.out.println("Child");
    }

    public void n1(){
        System.out.println("n1 in child");
    }
   /* public static void n1(){
        System.out.println("n1 in child");
    }*/
}
class SubCh extends Ch{

    int a = 999;
    public void n1(){
        System.out.println("n1 in subchild");
    }
   /* public static void n1(){
        System.out.println("n1 in subchild");
    }*/
}
public class CasesOf_ObjTypeCast {
    public static void main(String[] args) {
        Ch c = new Ch();
        c.m1();

        c.m2();

        ((P)c).m1();          //internal object is c

//        ((P)c).m2();        //compile time error  //internal object is c




        SubCh sc = new SubCh();


        //internal object is sc
        //since method overriding => JVM method resolution @RUntime based on Runtime Object Reference i.e. SubCh]
        sc.n1();

        //dont have variable over riding, therefore variable resolution always taken care by Compiler based on Reference type
        System.out.println(sc.a);

        //internal object is sc
        //since method overriding => JVM method resolution @RUntime based on Runtime Object Reference i.e. SubCh]
        ((Ch)sc).n1();

        //dont have variable over riding, therefore variable resolution always taken care by Compiler based on Reference type
        System.out.println( ((Ch)sc).a);

        //internal object is sc
        //since method overriding => JVM method resolution @RUntime based on Runtime Object Reference i.e. SubCh]
        ((P)((Ch)sc)).n1();

        //dont have variable over riding, therefore variable resolution always taken care by Compiler based on Reference type
        System.out.println(((P)((Ch)sc)).a);


    }
}
