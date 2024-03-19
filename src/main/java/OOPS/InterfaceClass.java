package OOPS;

interface DomesticAnimals{

    int domanicount = 10;
     void walk();
}
class Horse implements DomesticAnimals{

    @Override
    public void walk() {
        System.out.println("Horse is walking");
    }

    public void exercise(){
        System.out.println("Horse is doing exercise");
    }

}
class Chicken  extends Horse implements DomesticAnimals{

    @Override
    public void walk() {
        System.out.println("Chicken is walking");
    }
}
interface Donkey{
    public void run();
}

class Monkey implements DomesticAnimals,Donkey{           //multiple inheritance  ==> can call/inherit methods of both Class

    @Override
    public void walk() {
        System.out.println("Monkey is walking");
    }

    @Override
    public void run() {
        System.out.println("monkey is running");
    }
}
interface Goat{
    int goatID = 1;
    void goatMilching();

}
class Milching implements Goat{

    @Override
    public void goatMilching() {
        System.out.println("milching of animals");
    }
}

class NewAnimal{
    static void newAnimalWork(int id){
        System.out.println("I am static new animal and my id is : " + id);
    }
}

public class InterfaceClass {

    static int name = 1;
    public static void main(String[] args) {
//        Horse h = new Horse();
        DomesticAnimals h = new Horse();                        //upcasting
        System.out.println(DomesticAnimals.domanicount);     //Class.variable   (since static variable)
//        DomesticAnimals.domanicount=11;                    //(Since final varaible)


//        h.exercise();                                      // class Horse cant use exercise since it will have knowledge of DomesticAnimals only

//        to perform h.exercise() => you need to create Horse Reference and horse obj
        Horse horse = new Horse();
        horse.exercise();
        h.walk();

        Chicken c =new Chicken();
        c.walk();
        Monkey m = new Monkey();
        m.run();
        m.walk();

        Goat mil = new Milching();
        mil.goatMilching();
        System.out.println(Goat.goatID);            //interfaces==> called with class.variable==> since bydefault they are static attributes


        NewAnimal na = new NewAnimal();
        NewAnimal.newAnimalWork(123);           //Class.Method    Since method is static...

    }
}
