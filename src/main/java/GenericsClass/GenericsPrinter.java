package GenericsClass;

//public class GenericsPrinter <T> {
public class GenericsPrinter <T> {   //specific to Animal
    T thingToTPrint;


    public GenericsPrinter(T thingToTPrint) {
        this.thingToTPrint = thingToTPrint;
    }

    public void print(){
        System.out.println(thingToTPrint);
    }
}
