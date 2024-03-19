package BasicPrograms.PackageB;

import BasicPrograms.PackageA.Learn_PackageA;
import BasicPrograms.PackageA.Natak;

class LearnAccessModifier{

    private int no = 10001;
}



public class Learn_PackageB {


    public void displayInfo(){

        System.out.println("Hello World");
    }

    public static void main(String[] args) {

        Learn_PackageA lpa1 = new Learn_PackageA();
        lpa1.displayInfo();                            //since displayInfo() is of PUBLIC ACCESS MODIFIER

        System.out.println(lpa1.age);                  //since age is of PUBLIC ACCESS MODIFIER


        LearnAccessModifier lma = new LearnAccessModifier();
       // System.out.println(lma.no);
        // cant print since no is PRIVATE ACCESS MODIFIER






        Natak n = new Natak();
    }
}
