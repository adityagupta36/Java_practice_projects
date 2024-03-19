package MiscConcepts;
import java.lang.Object.*;
class MasterObject implements Cloneable {
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();                                          //return Clone method under clonable interface
    }
    String name;
    int id;
    MasterObject(String name,int id){
        this.name = name;
        this.id =id;
    }
    void runMO(){
        System.out.println("Hey this is " + name + " and id is " + id);
    }
}
public class MiscConceptsObjectCloning  {
    public static void main(String[] args) throws CloneNotSupportedException {       //exception handling
       try{                                                                      //try block
           MasterObject mo = new MasterObject("Aditya", 101);
           mo.runMO();
           MasterObject mo1 = (MasterObject) mo.clone();        //cloning
           mo1.runMO();
       }
       catch(CloneNotSupportedException c) {                  //catch block
           System.out.println(c);
       }


    }
}
