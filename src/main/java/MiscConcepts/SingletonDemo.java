package MiscConcepts;
class Singleton{

    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        System.out.println("In a singleton class");
        return instance;
    }
     private Singleton() {
    }
}

public class SingletonDemo {
    public static void main(String[] args) {

        Singleton s =  Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if(s==s1 && s1==s2){
            System.out.println("Singleton class: Both the Objects Are Same");
        }
        else System.out.println("Not a singleton class");
    }
}


/*
private static variable: called "instance" to hold the single instance of the class
private' Instance : is so that it's only visible to one class and cannot be accessed from elsewhere in the program

constructor of the class private so that no other instances can be created

public static method called getInstance to return the single instance of the class
 */