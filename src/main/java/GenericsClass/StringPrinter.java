package GenericsClass;

public class StringPrinter {
    String thingToTPrint;

    public StringPrinter(String thingToTPrint) {
        this.thingToTPrint = thingToTPrint;
    }

    public void print(){
        System.out.println(thingToTPrint);
    }
}
