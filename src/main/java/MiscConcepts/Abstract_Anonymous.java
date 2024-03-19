package MiscConcepts;

abstract class Ab {
    abstract void show();
}

public class Abstract_Anonymous {
    public static void main(String[] args) {

        Ab an = new Ab(){                    //we cant initialise Abstract class // But, here Anonymous inner class works for abstract class as well
            void show(){
                System.out.println("In a new B show");
            }
        };
        an.show();


    }
}

