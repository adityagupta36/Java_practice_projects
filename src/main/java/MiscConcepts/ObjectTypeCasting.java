package MiscConcepts;
class Base1{

}
class Derived1 extends Base1{

}
class Derived2 extends Base1{

}
class Base2{

}
class Derived3 extends Base2{

}
class Derived4 extends Base2{

}

class InternalThingsofObjectTypeCast{

}
class IOT1 extends InternalThingsofObjectTypeCast{

}
class IOT2 extends IOT1{

}
public class ObjectTypeCasting {
    public static void main(String[] args) {

        Base2 b = new Derived4();
        Derived4 d  =(Derived4) b;        //1)

//        Base1 b1 = (Base1) b;           //2)  @compile time  ==> compile error
        Base2 b2 = (Base2)b;              //3)

//        Object o = (Derived3) b;        //4)  @Runtime ==> .ClassCastException error. [class MiscConcepts.Derived4 cannot be cast to class MiscConcepts.Derived3]

//        Base2 b3 = (Base1)b;            //5) @Compile time error




        //IOT2 extends IOT1 extends InternalThingsofObjectTypeCast//
        InternalThingsofObjectTypeCast iot = new InternalThingsofObjectTypeCast();
        IOT2 iot2 = new IOT2();

        //IOT1 type reference & internal object is IOT2 type Runtime Object
        IOT1 iot1 = (IOT1)iot2 ;

        //InternalThingsofObjectTypeCast type refernence & internal object is IOT2 type only
        InternalThingsofObjectTypeCast iott = (InternalThingsofObjectTypeCast)((IOT1)iot2);
    }
}
