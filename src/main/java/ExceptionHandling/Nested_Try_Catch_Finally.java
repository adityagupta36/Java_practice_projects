package ExceptionHandling;

public class Nested_Try_Catch_Finally {
    public static void main(String[] args) {


//        case 1    //Inner catch block unable to catch exception==> //outer catch block will catch exception
 /*     try{
            System.out.println("Outer try block");

            try{
                System.out.println("Inner try block");
                System.out.println(10/0);
            }
            catch (NullPointerException e){                    //Inner catch block unable to catch exception
                System.out.println("Inner catch block");
            }
        }
        catch (ArithmeticException e){
            System.out.println("outer catch block");          //outer catch block will catch exception
        }

      finally {
          System.out.println("outer finally block");
      }*/




//        Case 2   //Inner catch block catches exception   ==>  //outer catch block will not be execute

/*        try{
            System.out.println("Outer try block");

            try{
                System.out.println("Inner try block");
                System.out.println(10/0);
            }
            catch (ArithmeticException e){                    //Inner catch block catches exception
                System.out.println("Inner catch block");
            }
        }
        catch (NullPointerException e){
            System.out.println("outer catch block");          //outer catch block will not be execute
        }
        finally {
            System.out.println("Outer Finally block");
        }*/


//case 3

        try{
            System.out.println("Outer try block");

            try{
                System.out.println("Inner try block");
                System.out.println(10/0);
            }
            catch (ArithmeticException e){                    //Inner catch block catches exception
                System.out.println("Inner catch block");
            }
        }
        catch (NullPointerException e){
            System.out.println("outer catch block");          //outer catch block will not be execute
        }
        finally {
            System.out.println("Outer Finally block");
        }



    }
}
