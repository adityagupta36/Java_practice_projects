package DataStructures;

public class MultiDimArray {
    public static void main(String[] args) {


        int [][] ar = new int[3][3];

        ar[0][0]=1;
        ar[0][1]=2;
        ar[0][2]=3;
        ar[1][0]=4;
        ar[1][1]=5;
        ar[1][2]=6;
        ar[2][0]=7;
        ar[2][1]=8;
        ar[2][2]=9;


        for (int i=0; i<ar.length ; i++){

            for (int j = 0 ; j< ar.length ; j++){

                System.out.println(ar[i][j]);

            }
//            System.out.println();
        }


    }
}
