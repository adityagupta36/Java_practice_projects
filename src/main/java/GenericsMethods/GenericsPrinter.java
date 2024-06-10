package GenericsMethods;

public class GenericsPrinter <T,V>{
    T thingToShout;
    V otherThingToShout;

    public GenericsPrinter(T thingToShout, V otherThingToShout) {
        this.thingToShout = thingToShout;
        this.otherThingToShout = otherThingToShout;
    }

    public  T print(){
        return this.thingToShout;
    }


}
