package OOPS;

public class This_Keyword {
    int id;
    String name;

    public void display(){
        System.out.println("id is " + this.id + " and name is " + this.name);
    }

    This_Keyword(int i_d, String _name_){
        this.id =i_d;         //if this. not used-. o and null printed
        this.name=_name_;

    }



    public static void main(String[] args) {
        This_Keyword s1 = new This_Keyword(1,"Aditya");
        This_Keyword s2 = new This_Keyword(2,"Aryan");

        s1.display();
        s2.display();

    }
}
