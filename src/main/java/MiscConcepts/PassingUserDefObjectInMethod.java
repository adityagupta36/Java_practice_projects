package MiscConcepts;


    class Vehicle{
        private int modelyear;

        public int getModelyear() {
            return modelyear;
        }

        public void setModelyear(int modelyear) {
            this.modelyear = modelyear;
        }
    }

    class Car{
        String carname="AUDI";

        public void method(Vehicle v){
            System.out.println("Carname is: " + carname + " And Model year is: " + v.getModelyear());

        }


//    ANOTHER METHOD
/*
    private void method(Vehicle vehicle) {
        vehicle.setModelyear(2015);
        System.out.println("Carname is: " + carname + " And Model year is: " + vehicle.getModelyear());
    }
*/

    }


    public class PassingUserDefObjectInMethod {



        public static void main(String[] args) {

            Car c = new Car();

//        ANOTHER METHOD
//        c.method(new Vehicle());       //Passing UserDef Object InMethod

            Vehicle v = new Vehicle();
            v.setModelyear(2015);

            c.method(v);                 //Passing UserDef ObjectRef InMethod

        }


    }


