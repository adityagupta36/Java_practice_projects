package DataStructures;

public class LearnArray {

    public static void main(String[] args) {

//        int [] arr = new int[5];
/*
        arr[0]=10;
        arr[1]=30;
        arr[2]=50;
        arr[3]=70;
        arr[4]=90;*/

        int [] arr = {12,30,50,70,90};


        System.out.println(arr[4]);

        for(int i =0; i<arr.length; i++){

            System.out.println(arr[i]);
        }


     /*   String [] name = new String[3];
        name[0]="My name";
        name[1]="is";
        name[2]="Aditya Gupta";*/

        String [] name = {"My", "name", "is", "Aditya"};


        System.out.println(name[2]);
        for ( int j=0; j<name.length; j++){

            System.out.println(name[j]);
        }

        System.out.println("another way of FOR LOOP");


        for(String names: name){
            System.out.println(names);
        }

    }
}
