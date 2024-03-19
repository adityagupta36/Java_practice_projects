package controlstatementpractice;

public class if_else {

    public static void main(String[] args) {


        String city1 = "delhi & mumbai";
        String city2 = " Mumbai";
        String city3 = "Mumbai";

        if (city1 == city2) {
            System.out.println("all correct");
        } else if (city1 == city3) {
            System.out.println("not equal");
        } else if (city1.endsWith("mumbai")) {
            System.out.println("your are at right place");
        } else {
            System.out.println("great");
        }

        System.out.println(city1);

        //grading sys   if - else-if  - else

        int aditya_marks = 66;

        if (aditya_marks > 90) {
            System.out.println("a grade");
        } else if (aditya_marks > 80 && aditya_marks < 90) {
            System.out.println("b grade");
        } else {
            System.out.println("c grade");
        }

        //nested if
        int a = 2, b = 4, c = 55;

        if (a < b) {
            if (b < c) {
                System.out.println("*correct*");
            }
        }

        //Another example

        System.out.println("<---------ANOTHER EXAMPLE---------->");

        int[] ag = {1, 2, 4, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        //print numbers which are multiple of 1 or else print not multiple of 2

        for(int i = 0; i<ag.length;i++) {
            if (ag[i]% 2 == 0) {
                System.out.println(ag[i]);
//                break;
            } else {
                System.out.println(ag[i] + " is not multiple of 2");
            }
        }

    }



}

