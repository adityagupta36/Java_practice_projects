package controlstatementpractice;

public class break_continue {
    public static void main(String[] args) {

        int a = 5;

        String name = "Aditya";


        for(int i=0; i<=a; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i);
        }
        System.out.println();

            System.out.println(name.charAt(4));

            System.out.println();

            for(int j=0;j<name.length();j++) {
                System.out.print(name.charAt(j) + "+");

                if(name.charAt(3)=='t'){
                    break;
                }
            }

            }
        }


