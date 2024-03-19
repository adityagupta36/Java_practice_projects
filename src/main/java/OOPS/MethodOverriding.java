package OOPS;

class Bank{
    int i = 3;
public int showROI(){
    return 1;
}
}
class PnbBank extends Bank{
    public int showROI(){
        return 7 ;
    }
}
class ICICIBank extends Bank{
    int i = 4;
    public int showROI(){
        return 11 ;
    }

    public void newROI(){
        System.out.println("New ROI");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ICICIBank b = new ICICIBank();
        System.out.println(b.showROI());         ///will call method of child class since inheritance
        b.newROI();
        System.out.println(b.i);                 //Reference of ICICI and obj of ICICIBANK => i = 11


        Bank ba = new ICICIBank();
        System.out.println(ba.showROI());      //will still call method of child class since inheritance  //method, argument type and return type of this overriding method is same in child class
        System.out.println(ba.i);               //Non static vairable wiil be implemented from superclass only //Reference of BANK and  obj of ICICIBANK => i = 10

    }
}
