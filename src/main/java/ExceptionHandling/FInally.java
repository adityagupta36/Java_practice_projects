package ExceptionHandling;

import BasicPrograms.P1.A;

public class FInally {
    public static void main(String[] args) {
/*
        //Case1
        try{
            System.out.println("try");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }
*/

/*        //case 2
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
*/

         //case 3
        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println("e");
        }
        finally {
            System.out.println("finally");
        }


        System.out.println("Helloe : this is abnormal termiantion, after finally no line of code will execute");
    }
}
