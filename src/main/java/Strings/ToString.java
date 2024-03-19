package Strings;

import java.util.ArrayList;

class Student{

     int id;
      String name;
     String cat;

    public Student(int id, String name, String cat) {
        this.id = id;
        this.name = name;
        this.cat = cat;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", cat='" + cat + '\'' +
//                '}';
//    }



//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCat() {
//        return cat;
//    }
//
//    public void setCat(String cat) {
//        this.cat = cat;
//    }

}

public class ToString {

    public static void main(String[] args) {

        ArrayList<Student> as = new ArrayList<>();

        as.add(new Student(1,"Aditya","ABC" ));
        as.add(new Student(2,"Akash", "NBFC"));
        as.add(new Student(3,"Anand", "XYX"));
        as.add(new Student(4, "Avinash", "EEE"));
        as.add(new Student(5,"Ansh","YYY"));


        for (Student ss : as){

            System.out.println(ss);

        }




//       for (int i =0; i<as.size() ; i++){
//           System.out.println(as.get(i).getId());
//       }

//        System.out.println(as);

    }
}
