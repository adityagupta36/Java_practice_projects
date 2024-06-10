package GenericsWildCards;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(799);

        printList(list);
    }

    private static void printList(List<?> list){
        System.out.println(list);
    }


}

