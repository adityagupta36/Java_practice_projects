import com.beust.ah.A;

class Animal{
//    String name = "animal";
}
class Monkey extends Animal{

}
class Test{
    public void m1(Animal a){
//        a.name="newanimal";
//        System.out.println(a.name);
        System.out.println("Animal Version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }

}

public class New_Practice1 {
    public static void main(String[] args) {

        Test t = new Test();
//        t.m1(new Animal());

        Animal a = new Animal();
        t.m1(a);

        Monkey m = new Monkey();
        t.m1(m);

        Animal am = new Monkey();
        t.m1(am);
    }
}
