package OOPS;
class Janwar{
    void food(){
        System.out.println("eating...");
    }
}
class Kutra extends Janwar{
    void bark() {
        System.out.println("barking...");
    }
}
class Cat extends Janwar{
    void sound(){
        System.out.println("meowing...");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {


        Cat c = new Cat();
        c.sound();
        c.food();
//        c.bark();    //error
    }
}