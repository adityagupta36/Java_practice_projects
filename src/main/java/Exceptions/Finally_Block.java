package Exceptions;

public class Finally_Block {

    static void checkAge(int age) {                    //throw keyword
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }



    public static void main(String[] args) {


        int a = 7;
        int b = 9;
            try {
                checkAge(999);
                throw new Exception("Arithmetic exception");
            } catch (Exception e) {
                System.out.println(e);
            } finally {                    //exception aane ke baad bhi execute hua even after using a break keyword,,      //kisi bhi haal main execute hoga
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        }
