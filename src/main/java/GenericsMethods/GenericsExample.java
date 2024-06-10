package GenericsMethods;

public class GenericsExample {
    public static <T, V> void main(String[] args) {
        shout("john",777444);
        shout("57",69);
        shout(33.0, "thirty three");


        GenericsPrinter<Integer,String> gp = new GenericsPrinter<Integer, String>(74,"Aditya");
        gp.print();
    }

    private static <T,V> void shout (T thingToShout, V otherTHingToShout){
        System.out.println(thingToShout + "!!!");
        System.out.println(otherTHingToShout+"!!!");
    }


}
