package MiscConcepts;

public class ClassObjCounter {
    private static int objectCount = 0; // static variable to keep track of object count

    public ClassObjCounter() {
        objectCount++; // increment object count every time a new object is created
    }

    public static int  getObjectCount() {
        return objectCount; // static method to retrieve the object count
    }

    public static void main(String[] args) {
        ClassObjCounter obj1 = new ClassObjCounter(); // create first object
        ClassObjCounter obj2 = new ClassObjCounter(); // create second object
        ClassObjCounter obj3 = new ClassObjCounter(); // create third object

        System.out.println("Number of objects created: " + ClassObjCounter.getObjectCount()); // print current count of objects
    }
}
