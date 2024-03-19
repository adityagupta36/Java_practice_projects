package Strings;

public class String_prax {
    public static void main(String[] args) {

        String firstName = "John ";
        String lastName = "Doe";
        firstName.concat("Hehehe");

        System.out.println(firstName);       //==> John

        System.out.println();
        System.out.println("**********************************************");
        System.out.println();

        StringBuffer fn = new StringBuffer("Hello ");
        fn.append("world");
        System.out.println(fn);

        StringBuilder fb = new StringBuilder("How are you ");
        fb.append("world");
        System.out.println(fb);

        String fname = "Aditya";
        String lname = "Aditya";
        if (fname==lname){
            System.out.println("Similar");
        }
        else System.out.println("Dissimilar");

        System.out.println();
        System.out.println("**********************************************");
        System.out.println();


        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = s1;
        String s4 = "Hello";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

//string1.equals(string2) ==> Compares this string to the specified object.

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s4.equals(s1));


        System.out.println();
        System.out.println("**********************************************");
        System.out.println();

        String ss1 = "hello";
        String ss2 = new String("hello");
        String ss3 = s1;
        String ss4 = "hello";

        System.out.println((ss1==ss2));
        System.out.println((ss2==ss3));
        System.out.println((ss3==ss4));
        System.out.println((ss4==ss1));



        System.out.println();
        System.out.println("**********************************************");
        System.out.println();



        StringBuilder sb = new StringBuilder();
        long sb_currtime = System.currentTimeMillis();
        for (int i=1 ; i<10000 ; i++){
            System.out.print(i + " ");
        }
        long sb_endtime = System.currentTimeMillis();
        System.out.println("Net time =>" + (sb_endtime-sb_currtime));

        System.out.println();
        System.out.println("**********************************************");
        System.out.println();

        StringBuffer sf = new StringBuffer();
        long sf_currtime = System.currentTimeMillis();
        for (int i=1 ; i<10000 ; i++){
            System.out.print(i + " ");
        }
        long sf_endtime = System.currentTimeMillis();
        System.out.println("Net time =>" + (sf_endtime-sf_currtime));


        System.out.println();
        System.out.println("**********************************************");
        System.out.println();





        System.out.println("string equals() method compares two strings and returns true if all characters match in both strings, else returns false. The == operator compares the reference or memory location of objects in a heap, whether they point to the same location or not.");




    }
}
