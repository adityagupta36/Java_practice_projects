package GenericsClass;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {

        IntegerPrinter ip = new IntegerPrinter(23);
        ip.print();


        DoublePrinter dp = new DoublePrinter(33.0);
        dp.print();


        StringPrinter sp = new StringPrinter("fourty three");
        sp.print();

        System.out.println("*************************************************");

        GenericsPrinter<Integer> gp1 = new GenericsPrinter<>(23);
        gp1.print();

        GenericsPrinter<Double> gp2 = new GenericsPrinter<>(33.0);
        gp2.print();

        GenericsPrinter<String> gp3 = new GenericsPrinter<>("fourty three");
        gp3.print();

        ArrayList<Cats> ac = new ArrayList<>();
        ac.add(new Cats());
//        ac.add(new Dogs());

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cats());
        cats.add(new Dogs());

//        System.out.println(cats.get(0).getClass().getName());
//        System.out.println(cats.get(1).getClass().getName());

        Cats c = (Cats) cats.get(0);        //Class Cast Exception






    }
}
