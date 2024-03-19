package OOPS;

class Animal{
    String sound = "Animal voice";
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks" +" " + sound);
    }
}
public class SingleInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();  //if used => Animal d = new Dog() ==> then d.bark() cant be called ==>only d.eat() can be called
        d.bark();
        d.eat();

        Animal an = new Dog();
        an.eat();
//        an.bark();    //error: variable an of type OOPS.Animal    //since parent reference

    }
}
