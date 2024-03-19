package OOPS;
class Father{
    public void property(){
        System.out.println("CASH + GOLD + LOAN");
    }
    public void marry(){
        System.out.println("A-Girl or B-Girl");
    }
}
class Son extends Father{
    @Override
    public void marry(){
        System.out.println("X-Girl or Z-Girl");
    }
}

public class Over_Riding {
    public static void main(String[] args) {
        Father f = new Father();
        f.marry();
        f.property();

        Son s = new Son();
        s.marry();
        s.property();

        Father fs = new Son();
        fs.marry();
        fs.property();


    }
}
