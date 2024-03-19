package OOPS;
abstract class Shapes{
    abstract  void callShapes();         //abstract class not have body

     void learnGeometry(){
        System.out.println("Hi i am concrete method of abstract class SHAPES: maths is fun");
    }      //abstract class can have their own concrete methods also
}
class Rectangle extends Shapes{             //class extending abs class must declare abstract methods of parent class
     void callShapes(){
        System.out.println("This is abstract class from SHAPES: called under rectangle class");
    }


    void callRectShapeMeth(){
        System.out.println("hey this is rect class meth");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();             //Child reference and Child obj creation

        s.callShapes();

        Shapes sa = new Rectangle();
        sa.learnGeometry();                       //parent class method will be called Since INHERITANCE

        s.callRectShapeMeth();


    }

}
