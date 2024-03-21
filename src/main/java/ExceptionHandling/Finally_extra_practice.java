package ExceptionHandling;

public class Finally_extra_practice {
    public static void main(String[] args) {
//        case 1==> No exception                    ==> Normal termination
        try{
            System.out.println("stmt 1");
            System.out.println("stmt 2");
            System.out.println("stmt 3");
        }
        catch (Exception e){
            System.out.println("stmt 4");
        }
        finally {
            System.out.println("stmt 5");
        }

        System.out.println("stmt 6");

//        case 2  Exception at stmt2 and corresponding catch block matched  ==> Normal Termination
/*        try{
            System.out.println("stmt 1");
            System.out.println(10/0);
            System.out.println("stmt 3");
        }
        catch (Exception e){
            System.out.println("stmt 4");
        }finally {
            System.out.println("stmt 5");
        }
        System.out.println("stmt 6");*/


//        case 3  Exception at stmt2 and corresponding catch block not matched ==> Abnormal termination
/*
        try{
            System.out.println("stmt 1");
            System.out.println(10/0);
            System.out.println("stmt 3");
        }
        catch (NullPointerException e){
            System.out.println("stmt 4");
        }
        finally {
            System.out.println("stmt 5");
        }

        //this line will not be executed since exception not handled or corresponding catch block  not matched or exception in catch block
        System.out.println("stmt 6");
*/


//        case 4   Exception st stmt 4        //Abnormal termination
/*        try{
            System.out.println("stmt 1");
            System.out.println(10/0);
            System.out.println("stmt 3");
        }
        catch (Exception e){
            System.out.println(5/0);
        }
        finally {
            System.out.println("stmt 5");
        }

        //this line will not be executed since exception not handled or corresponding catch block  not matched or exception in catch block
        System.out.println("stmt 6"); */

/*//        case 5   Exception at stmt 5 or stmt 6                     //Abnormal termination
        try{
            System.out.println("stmt 1");
            System.out.println("stmt 2");
            System.out.println("stmt 3");
        }
        catch (Exception e){
            System.out.println("stmt 4");
        }
        finally {
            System.out.println(10/0);
        }
        System.out.println(10/0);*/
    }
}
