package GenericsClass;

public class Animal {
    public <T> void eat(T animal) {
        System.out.println("Animals are eating");
    }
}
