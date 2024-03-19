package MiscConcepts;

class An{
    void show(){
        System.out.println("In A show");
    }
}
//class Bn extends An{                          //All new Bn class created just to override only one method which looks complex
//    void show(){
//        System.out.println("In a B show");
//    }
//}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        An an = new An()
        {
            void show(){                                       //Anonymous inner class<=no name therefore anonymous
                System.out.println("In new show");
            }
        };
        an.show();
    }
}
