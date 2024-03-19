package MiscConcepts;

public class WrapperClass {
    public static void main(String[] args) {
        int num =7;
        //primitive datatype to wrapper class =>Autoboxing
        Integer num1 = num;                   //==>Auto-boxing

        System.out.println(num + num1);


        //if need to convert Wrapper class to primitive datatype=>Unboxing
//        int num2 = num1.intValue();          //Unboxing
        int num2 = num1;                      //==>Auto-unboxing
        System.out.println(num2);


        String st = "123";
//        System.out.println(st*2);      //error
        int n = Integer.parseInt(st);           //parsing
        System.out.println(n*2);
    }
}
