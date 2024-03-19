package BasicPrograms.PackageA;



public class Learn_PackageA {
    String name = "Aditya";         //BY-DEFAULT ACCESS MODIFIER
   public int age = 26;

   protected String surname = "Gupta";

    public void displayInfo(){
        System.out.println("my name and age is "+ name + " "+age);
    }
    public static void main(String[] args) {

        Learn_PackageA lpa = new Learn_PackageA();
        lpa.displayInfo();
        System.out.println(lpa.surname);    //PROTECTED MODIFIER CLASS OF SAME PACKAGE AND SUBCLASS OF ANOTHER PACKAGE


    }
}
