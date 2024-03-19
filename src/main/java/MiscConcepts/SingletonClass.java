package MiscConcepts;

class A {
    private static  A a = new A();

    private A (){           //private constructor =>not able to create an object of the class

    }

    public static A getA(){         //static factory method
        return a;
    }

}

public class SingletonClass {                            //Singleton class==> only one instamce of a class
    public static void main(String[] args) {
        A a = A.getA();                           //since static method
        System.out.println(a.hashCode());
//        A b = new A(); // multiple instances of same class==> if not allowed then we use singleton class
        A b =  A.getA();
        System.out.println(b.hashCode());
    }
}
