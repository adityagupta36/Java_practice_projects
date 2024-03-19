package Strings.out.production.Strings.Strings;

class StudDet{
    int roll;
    String name;

    @Override
    public String toString() {
        return "StudDet{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public StudDet(int roll, String name) {
        this.roll=roll;
        this.name=name;
    }
}
public class DemoToString {
    public static void main(String[] args) {
        StudDet sd = new StudDet(1,"Aditya");
        //System.out.println(sd.roll +" "+ sd.name);
        System.out.println(sd);  //above sent can be avoide using tostring method   //Java compiler internally calls toString() method


//        System.out.println(sd);  //if tostring not used:  sd  prints the hashcode values of the objects
    }
}
