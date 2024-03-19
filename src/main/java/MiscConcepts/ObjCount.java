package MiscConcepts;

import BasicPrograms.P1.A;

import java.util.ArrayList;

class OC{
   static ArrayList<OC> oclist = new ArrayList<>();


   // this keyword: can be used to refer current class instance variable
    public OC() {
        oclist.add(this);
    }   //whenever obj of class OC created, it will be added into an arraylist


    public static int getObjCount(){
        return oclist.size();
    }

}

public class ObjCount {
    public static void main(String[] args) {
        OC oc= new OC();
        OC oo= new OC();
        OC cc= new OC();

        System.out.println(OC.getObjCount());

    }
}
