package OOPS;
class Address{
    String city;
    int pincode;
    public Address(String city, int pincode){
        this.city=city;
        this.pincode=pincode;
    }
}

class Employee{
    String name;
    int id;
    Address address = new Address("mumbai",400066); //creating entity reference in Class(Employee) which Has-A rel of Address
    public void information(String name, int id){
        System.out.println("employee information are as follows : " + "Name: " + name + ", " + "id: "+ id + ", " + "city: " + address.city+", " +"pincode: " + ", " + address.pincode);
    }

}
public class AggregationHas_A_Rel2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.information("Aditya",1);

        System.out.println(e.address.city);  //important concept
    }
}
