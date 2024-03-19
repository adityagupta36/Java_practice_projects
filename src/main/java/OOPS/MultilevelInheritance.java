package OOPS;

class Shape{
    public void findProperties(){
        System.out.println("Lets find properties");
    }
}
class Triangle extends Shape{
    double base = 5;
}
class EqTriangle extends Triangle{
    public void findingArea(){
        System.out.println("Area is " + ( (Math.sqrt(3))/4.0 ) * base * base);
    }
}


class Animals{
    void eat(){System.out.println("eating...");}
}
class Dogs extends Animals{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dogs{
    void weep(){System.out.println("weeping...");}
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        EqTriangle property = new EqTriangle();
        property.findProperties();
        property.findingArea();

        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();

    }
}
