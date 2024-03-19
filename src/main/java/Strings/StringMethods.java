package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Aditya";
        System.out.println(name);
        int value =  name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "           Aditya       ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(3));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('y', 'i'));
        System.out.println(name.replace("ya","aa"));
        System.out.println(name.replace("t","ttee"));
        System.out.println(name.startsWith("Ad"));
        System.out.println(name.endsWith("ya"));
        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("ty"));
        System.out.println(name.indexOf("a",3));

        String newName = "Aditytya";
        System.out.println(name.indexOf("ty"));
        System.out.println(newName.indexOf("ty",4));
        System.out.println(newName.lastIndexOf("y"));
        System.out.println(newName.lastIndexOf("t",6));
        System.out.println(name.equals("Aditya"));
        System.out.println(name.equalsIgnoreCase("adityA"));
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \' double quote");
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \t double quote");


        String a = "Helloworld kheloworld";
        System.out.println(a.replace("khelo", "jhelo"));        //sout==>Helloworld jheloworld

        System.out.println(a.replace("o", "p"));      //sout==>Hellpwprld khelpwprld
        System.out.println(a.concat("nice"));

    }
}
