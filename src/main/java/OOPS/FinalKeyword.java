package OOPS;
class Final{
//    final int id = 1;
    final String name;
    final void changeName(){
//        id=2;                                         //variable as final, you can't change value of final variable
        System.out.println("Under final class: " + name);
    }
    Final (String changeName){
        this.name= changeName;                               //can initialize blank final variable in constructor only
    }

}
//final class SemiFinal extends Final{                    //final class cant be inherited
//    void changeName(){                                 //method as final, you cannot override it.
//        System.out.println("Under Semifinal class");
//    }
//}
//final class QuarterFinal extends SemiFinal{
//
//}
public class FinalKeyword {
    public static void main(String[] args) {
        Final f = new Final("aditya");
        f.changeName();
    }
}
