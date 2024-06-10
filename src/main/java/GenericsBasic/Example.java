package GenericsBasic;

public class Example {

    public static void main(String[] args) {

       /* Box box = new Box("String");
        Box box1 = new Box(123);

        System.out.println(box.getValue());
        System.out.println(box1.getValue());*/

        Box<String> box = new Box<>("String");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());


        Box<Integer> box1 = new Box<>(123);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

    }
}
