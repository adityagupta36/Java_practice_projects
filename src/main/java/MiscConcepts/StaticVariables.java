package MiscConcepts;

public class StaticVariables {

    String name;                      //instance dependent variable[created at class level]
    String taluka;
   static String city = "Mumbai";     //All objects share same variable(since its static)   //static variable ==> belongs to class(creates memory one time)

     static int a =0;                  //if not static, it will freshly access a=0 and will not remember obout other obj manipulated it

    public StaticVariables(String name, String taluka) {

        this.name=name;
        this.taluka=taluka;
        a++;
        System.out.println(a);
    }

    public void getAddress(){

        System.out.println(taluka + " "+ city);
    }


    public  static void getCity(){                //static method will accept only static variables...
        System.out.println( city);
    }

    public static void main(String[] args) {

        StaticVariables sv1 = new StaticVariables("Aditya" , "Borivali" );

        StaticVariables sv2 = new StaticVariables("Aakash" , "Kurla" );


        sv1.getAddress();
        sv2.getAddress();

        StaticVariables.getCity();



    }
}
