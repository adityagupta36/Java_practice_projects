package MiscConcepts;

class ThisParent{

    public ThisParent(){
        System.out.println("Hey this Parent Class Constructor");
    }


}

class ThisChild extends ThisParent{

    int age = 11;                                                   //global variable

    public void displayInfo(){
        System.out.println("This is global level [CLASS LEVEL] method ");
    }
    public void printInfo(){

        int age = 6;                                                //local variable

        System.out.println(age);
        System.out.println("this keyword age is " + this.age);     //to access global class level variable
        this.displayInfo();                                        //to access global class leve method


    }
}

public class ThisDemo {

    public static void main(String[] args) {

        ThisChild tc = new ThisChild();

        tc.printInfo();
    }
}
