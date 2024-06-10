package GenericsClass;

public class DoublePrinter {
    Double thingToTPrint;

    public DoublePrinter(Double thingToTPrint) {
        this.thingToTPrint = thingToTPrint;
    }

    public void print(){
        System.out.println(thingToTPrint);
    }
}
