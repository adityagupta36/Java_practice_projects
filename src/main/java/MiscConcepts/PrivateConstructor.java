package MiscConcepts;
class Box{
    static Box getBox(){
        return  new Box();
    }
    private Box(){

    }
}

public class PrivateConstructor {
    public static void main(String[] args) {

        Box b = Box.getBox();
        Box b2 = Box.getBox();
    }
}
