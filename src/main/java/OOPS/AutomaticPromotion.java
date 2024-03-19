package OOPS;
class AutoPromo {

    // A method that accept integer as parameter
    public  void method(int i) {
        System.out.println(
                "Automatic Type Promoted to Integer-" + i);
    }

    // A method that accept double as parameter
    public  void method(double d) {
        System.out.println(
                "Automatic Type Promoted to Double-" + d);
    }

    // A method that accept object as parameter
    public  void method(Object o) {
        System.out.println("Object method called");
    }
}

public class AutomaticPromotion{

    public static void main(String[] args)
    {
        // method call with char as parameter
        AutoPromo ap = new AutoPromo();
        ap.method('a');

        // method call with int as parameter
        ap.method(2);

        // method call with float as parameter
       ap. method(2.0f);

        // method call with a string as parameter
        ap.method("Geeks for Geeks");
    }
}

