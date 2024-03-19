package MiscConcepts;

class SuperAditya{

    String name = "Aditya";

    public void getData(){
        System.out.println("in parent class");
    }

    public SuperAditya(){
        System.out.println("In Parent class constructor");
    }

}
class ChildSuperAditya extends SuperAditya{

    String name = "Aakash";

    public void getData(){                              //Method Over ridden
        super.getData();                                //calling parent method using super keyword
        System.out.println("in child class");
    }

    public void printName(){
        System.out.println("My name is " + name);
        System.out.println("My name is using super keyword " + super.name);   //calling parent variable using super keyword //if parent and child have same field variables
    }

    public ChildSuperAditya(){
        super();               //super()' must be first statement in constructor body //calling parent constructor using super keyword
        System.out.println("In Child class constructor");
    }
}

public class SUPER_Keyword {
    public static void main(String[] args) {


        ChildSuperAditya csa = new ChildSuperAditya();
//        System.out.println(csa.name);

        csa.printName();
        csa.getData();
    }
}
