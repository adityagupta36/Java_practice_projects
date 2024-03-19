package MiscConcepts;


public class NarrowTypecast {
    public static void main(String[] args) {

        int i = 11;
        byte j = (byte) i;
        System.out.println(j);

        double x = 100000;
        int y =( int)x;
        System.out.println(y);


    }
}
