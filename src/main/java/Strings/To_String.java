package Strings;

class Students {
    int rollno;
    String name;
    String city;

    Students(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {//overriding the toString() method
        return rollno + " " + name + " " + city;
    }
}

public class To_String {
    public static void main(String[] args) {
        Students s1=new Students(101,"Raj","lucknow");
        Students s2=new Students(102,"Vijay","ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}


