package OOPS;
class PC{
    public PC(){
        System.out.println("Hey this is constructor of PC class");
    }
    int amt = 8;
    public void callPC_Method(){
        System.out.println("calling Pc method");
    }
}
class CP extends PC{
    int amt =10;

    public CP(String name, int id) {
        super();                                                                     //super ==> refer immediate parent class constructor
        System.out.println("under CP class name and id is" + name + " " + id);
    }

    public void callPC_Method(){
        System.out.println("calling PC method in CP class");
    }
    public void callCP_Method(){
        System.out.println("Calling CP method in CP class");
    }
    public void callPC(){
        System.out.println("amount is:" + super.amt);      //super ==> refer immediate parent class instance variable
        super.callPC_Method();                             //super ==> refer immediate parent class method
    }
}
public class SuperKeyword {
    public static void main(String[] args) {

        CP pc = new CP("Aditya",1);
        pc.callPC();

    }
}
