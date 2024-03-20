package ExceptionHandling;

public class Try_Multiple_Catch {
    public static void main(String[] args) {

        System.out.println("Practice Try catch");

        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(e  +  " "+ "'exception handled");
        }
        catch (Exception e){
            System.out.println(e);
        }



 /*       try {
            System.out.println(10/0);
        }

        catch (Exception e){
            System.out.println(e);
        }
        catch (ArithmeticException e){                   //Compile time error //exception 'java.lang.ArithmeticException' has already been caught
            System.out.println(e  +  " "+ "'exception handled");
        }*/



/*        try {
            System.out.println(10/0);
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArithmeticException  e){                             //compile time error
            System.out.println(e  +  " "+ "'exception handled");
        }*/

    }
}
