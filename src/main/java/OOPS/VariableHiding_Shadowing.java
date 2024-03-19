package OOPS;
class Parent{
    static String s = "Aditya";
}
class Children extends Parent{
     String s = "Anand";
}

public class VariableHiding_Shadowing {
    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println(p.s);

        Children c = new Children();
        System.out.println(c.s);

        Parent pc = new Children();
        System.out.println(pc.s);
    }
}
/*
Over Riding  only in Method
In Variable,ALWAYS(Don’t matter static or non static): Variable resolution is taken care by Compiler based on Reference type.
 */
