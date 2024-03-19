package MiscConcepts;

class Outer{

    static  int a = 50;

    public static void display(){
        System.out.println(a);
    }
    static class Inner{

        /*
        if inner class is static then, it can access only static variable)
         */
        void playMusic(){
            System.out.println("Play music In Inner class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {

        Outer a = new Outer();
        Outer.display();


        //How to create object of static inner class
        Outer.Inner b = new Outer.Inner();
        b.playMusic();
    }
}
