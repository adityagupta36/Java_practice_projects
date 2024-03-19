package BasicPrograms;


interface I1{
    void walk();

}

class CLASS1 implements I1{
    @Override
    public void walk(){
        System.out.println("I am walking in class1");
    }

    public void run(){
        System.out.println("I am running");
    }
}

class CLASS2 implements I1{

    @Override
    public void walk() {
        System.out.println("I am walking in class2");
    }
}
public class IntPrac{
    public static void main(String[] args) {

        I1 i = new CLASS1();
        i.walk();
//        i.run();              //since I1(parent ref) has no idea of run() met of CLASS1


        CLASS1 c = new CLASS1();
        c.walk();
        c.run();


        I1 i2 = new CLASS2();
        i2.walk();


    }
}
