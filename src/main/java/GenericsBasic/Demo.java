package GenericsBasic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Aditya");

        List anotherlist = new ArrayList();
        anotherlist.add("1");
        anotherlist.add(15.11);

        System.out.println(list);
        System.out.println(anotherlist);
    }

}
