package MiscConcepts;

/*
//Nested Class increases ENCAPSULATION//


     //help you to logically group classes that are only used in one place
     //Non-static nested classes are called inner classes
     /Inner class can access the variables of the outer class including the private or static instance variables.
     (but inner class and the variable&meth of Outer class should also be non-static)

     (if inner class is static then, it can access only static variable)


 */
class I {
   private static int age=26;
   static int dob = 30121997;
    public static void show(){
        System.out.println("SHOW");

    }


     class N{                                     //help you to logically group classes that are only used in one place     //Non-static nested classes are called inner classes //Nested Class

        String city = "Lucknow";


        public void confing(){
            System.out.println("In Congig ==> " + age + " ==> " + dob);    //Inner class can access the variables of the outer class, including the private instance variables.
        }


    }


}


public class InnerClass {
    public static void main(String[] args) {

        I obj = new I();
        obj.show();

        I.N nested = obj.new N();              //How to call Non-static Inner class
        nested.confing();
        System.out.println(nested.city);

    }
}
