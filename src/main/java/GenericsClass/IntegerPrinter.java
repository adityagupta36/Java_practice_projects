package GenericsClass;

public class IntegerPrinter {
    Integer thingToTPrint;

    public IntegerPrinter(Integer thingToTPrint) {
        this.thingToTPrint = thingToTPrint;
    }

    public void print(){
        System.out.println(thingToTPrint);
    }
}
