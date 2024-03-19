package OOPS;
class Office1{
    public void showInfo(String empName, int id1){
        System.out.println("info is ==>" + empName + " and " + id1);
    }

    public void showInfo(String empName, int id1 , int id2){                            //by changing number of arguements or changing data type
        System.out.println("info is ==>" + empName +  " and " + id1 +" and "+ id2);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Office1 of1 = new Office1();
        of1.showInfo("Aditya" , 1);
        of1.showInfo("Aryan", 2, 3);
    }
}
