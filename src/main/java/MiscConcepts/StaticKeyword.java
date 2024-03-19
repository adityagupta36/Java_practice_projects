package MiscConcepts;
class Student_Details{
    String name;

    int i = 0;                                        //instance variable
    static int total_obj =0;
    static int rollno=0;                              //counter
    static String clg;


    public static void setClg(String clg) {           //method has to be static, since no obj created and called @Class level
        Student_Details.clg = clg;
    }

    public void getDetails(){
        rollno++;
        System.out.println("Student Details are:: " + name + " " + rollno + " " + clg);

    }

    public Student_Details(String name) {                //Constructor

        i++;

        //Count Number of Objects of Class in Java//
        total_obj++;                                  //Whenever object is created, it will globally change the value=>0,1,2,3...    // will count total number of objects created
        this.name = name;
        System.out.println(total_obj);

    }

}

public class StaticKeyword {
    // static method
    static void m1() {
        System.out.println("from m1");
    }
    public static void main(String[] args) {

            // calling m1 without creating
            // any object of class Test
            m1();

            Student_Details.setClg("TCET");                                //class.method()
            Student_Details sd = new Student_Details("Aditya" );
            Student_Details sd1 = new Student_Details("Atmiya");
            Student_Details sd2 = new Student_Details("Akash");

            sd.getDetails();              //will consider i=0;
        System.out.println(sd.i);
            sd1.getDetails();             //will consider i=0;
        System.out.println(sd1.i);
            sd2.getDetails();             //will consider i=0;
        System.out.println(sd2.i);





    }
}
/*Why Constructor cant be static=> can't be static, As constructor is invoked automatically when obj is created, but static property can run w/o object creation, but for constructor obj cretion is required. SO Both contradicts each other
main method static==> Since we dont need obj to call main method
Static variable ==> stored in CLassLoader Memory
Static variables: When a variable is declared as static,
then a single copy of the variable is created and shared among all objects at the class level.
Static variables are, essentially, global variables. All instances of the class share the same static variable.
 */

