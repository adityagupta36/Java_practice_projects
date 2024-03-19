package controlstatementpractice;

public class WhileAndDoWhile_Break {
    public static void main(String[] args) {

        int i;
        do {

            for (i = 0; i <= 10; i++) {

                System.out.print(i);
            }
        }
        while (i < 6);      //condition checked at end

        System.out.println();

        int j;
        for (j=1;j<=10;j++) {

            if (j == 7) {
                break;           //break condition
            }
            System.out.print(j);


        }

            }
}


