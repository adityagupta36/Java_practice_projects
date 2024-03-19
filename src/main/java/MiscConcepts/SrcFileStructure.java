package MiscConcepts;


class E{
    public static void main(String[] args) {
        System.out.println("E class main method");
    }
}
class B{
    public static void main(String[] args) {
        System.out.println("B class main method");
    }
}
class C{
    public static void main(String[] args) {
        System.out.println("C class main method");
    }
}
class D{

 }


 /*
 javac E.java
 java E            ==> prints

 javac B.java
 java B            ==> prints

 javac C.java
 java C            ==> prints

 javac D.java
 java D  ==> error  main method not found
  */
