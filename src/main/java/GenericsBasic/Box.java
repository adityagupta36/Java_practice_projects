package GenericsBasic;

public class Box <T> {
    T container;

    public Box(T container){
        this.container=container;
    }

    public T getValue(){
        return this.container;
    }
}
