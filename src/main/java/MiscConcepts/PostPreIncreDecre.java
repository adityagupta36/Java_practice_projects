package MiscConcepts;

public class PostPreIncreDecre {
    public static void main(String[] args) {

        int a =10;
        int b =0;
        a= b++;
        System.out.println(a);         //i++ => use the current value, and then we want to increment the value of i by 1.
        System.out.println(b);

    }
}
