package ExceptionHandling;

import BasicPrograms.P1.A;

public class FInally {
    public static int returnName(){
        System.out.println("returning name");
        try{
            return 33;                                      //return type int==> returns 33
        }
        catch (Exception e){

        }
        finally {
            return 100;                                     //finally block: return will be given priority instead of try block: return
        }
    }
/*    public static void returnName(){
        System.out.println("returning name");
        System.out.println("Returned");
        return ;                                  //return type void==> returns void //return keyword can or can not be written while void return type
    }*/

    public static void main(String[] args) {

        System.out.println(returnName());

        //Case1
        try{
            System.out.println("try");          //finally block will not execute, since JVM shutdowns...
            System.exit(0);
            return  ;                             //return vs finally block
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            //First finally will be executed and then return keyword will be considered in try block
            System.out.println("finally");
        }

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
/*        try{
            System.out.println("try");
            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println("e");
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("Helloe : this is abnormal termiantion, after finally no line of code will execute");*/
    }
}
