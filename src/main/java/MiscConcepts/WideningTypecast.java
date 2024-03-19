package MiscConcepts;

public class WideningTypecast {
    public static void main(String[] args) {

        int a =100;

        double y = a;

        System.out.println(y);

        float z = a;
        System.out.println(z);

        float q = 100.0f;
        double r = q;
        System.out.println(r);
    }
}
