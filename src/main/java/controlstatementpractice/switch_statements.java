package controlstatementpractice;

class NestedSwitchCase {

    public void nestedSwitch() {

        int year = 3;
        String branch = "civil";

        switch (year) {
            case 1:
                switch (branch) {
                    case "mech":
                        System.out.println("mc design");
                        break;

                    case "civil":
                        System.out.println("concrete design");
                        break;

                    case "cs":
                        System.out.println("java basics");
                        break;
                }
                break;

            // similarly case2

            case 3:
                switch (branch) {
                    case "mech":
                        System.out.println("ic engine");
                        break;

                    case "civil":
                        System.out.println("beam design");
                        break;

                    case "cs":
                        System.out.println("DSA");
                        break;
                }
                break;
        }

    }
}

    public class switch_statements {
        public static void main(String[] args) {

            int month = 1;
            String month_name;

            switch (month) {

                case 1:
                    month_name = "jan";
                    System.out.println(month_name);

                    //break;                 //if break not use==> it will jump to next line of code and will not end switch case
            /*
            .
            .
            .
             */
                case 2:
                    month_name = "february";
                    System.out.println(month_name);

                    break;                    //use of break
                case 6:
                    month_name = "june";
                    System.out.println(month_name);

                default:                          //use of deafult
                    System.out.println("re eneter coreect month");

            }



        NestedSwitchCase nsc = new NestedSwitchCase();
        nsc.nestedSwitch();


    }
}

