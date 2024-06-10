package GenericsReturnTypeMethod;

import GenericsClass.Dogs;
import GenericsClass.DoublePrinter;

public class GenericsExample {

    public static void main(String[] args) {

        GenericsPrinter gp = new GenericsPrinter();
        System.out.println(gp.print(23.0,23));

    }

}
