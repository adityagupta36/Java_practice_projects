package BasicPrograms;

public class MultipleOfTwo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int s : arr){

            if(s%2 == 0){
                System.out.println("Multiple of 2 : " +s);
                //break;  //to find the very first multiple of 2
            }
            else {
                System.out.println("not multiple of 2 : "+ s);
            }

        }
    }
}
