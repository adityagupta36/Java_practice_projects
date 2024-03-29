package MiscConcepts;

class Address{

   private String city;
   private String state;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Employee{

    int id;
    String name;
    Address address;

    public  Employee(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.getCity()+" "+address.getState()+" "+address.getCountry());
    }

}

public class HasA_Rel {
    public static void main(String[] args) {

        Address address =new Address();
        address.setCity("Mumbai");
        address.setCountry("India");
        address.setState("Maharashtra");



        Employee e = new Employee(1 ,"Aditya",address);
        e.display();


    }
}
