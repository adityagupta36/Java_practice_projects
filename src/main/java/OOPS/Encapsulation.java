package OOPS;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Person{
    private String name="Aditya";
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {               //getters and setters
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person per= new Person();
//        per.name;                // error==> name has private access
//        per.id;                  // same as above
        per.setId(1);
        per.setName("Aditya");
        System.out.println("Details of students are "+per.getId()+" and " + per.getName());
    }
}
