package MiscConcepts;
class CO{
    String name,address,college;
            int id;
    public CO(String college, String address){
        this.college=college;
        this.address=address;
    }

    public CO(int i, String name) {
        this("TCET","Mumbai");
        this.id=i;
        this.name=name;

    }
}
class AC{
    AC(){                                    //Calling parameterized constructor from default constructor:
        this(5);
        System.out.println("hello a");
    }
    AC(int x){
        System.out.println(x);
    }
}

public class This_Const_Oveload {
    public static void main(String[] args) {
        CO c = new CO(101,"Aditya");

        System.out.println(c.address);
        System.out.println(c.name);
        System.out.println(c.college);
        System.out.println(c.id);


        AC a=new AC();
    }


}

