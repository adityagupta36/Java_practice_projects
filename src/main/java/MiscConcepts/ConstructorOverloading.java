package MiscConcepts;

class Student{

    int age;
    String name;

    int phno;

    public void getData(){
        System.out.println(name + " ==> " + age );
        System.out.println(phno);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.phno = phno;
    }

    public Student(int age, String name, int phno) {     //constructor overloading
        this.age = age;
        this.name = name;
        this.phno = phno;
    }

    public Student(){
        System.out.println("This is a default constructor");
    }

}
public class ConstructorOverloading {
    public static void main(String[] args) {

        Student s = new Student();

        Student s1 = new Student(19,"Aditya");
        s1.getData();

        Student s2 = new Student(29,"Aakash", 999999999);
        s2.getData();
    }
}
