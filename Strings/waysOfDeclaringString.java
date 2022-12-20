package Strings;
import java.util.Scanner;

public class waysOfDeclaringString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                    //String --> A string is a series of character.

        //string is a class but can be used as a datatype.

        //Strings are immutable and cannot be changed.

        //char --> defined in single quote ''
        //String --> defined in double quotes " "



        String name = new String("Arpita"); //First way of writing string
        System.out.println(name);

        String name2 = "Honeyy";          // Another way of writing the string
       System.out.println(name2);

    System.out.print("My name is ");   // ways of printing a line
       System.out.print("abhii");




        //System.out.println(); --> println --> it will bring cursor to next line
      //  System.out.print(); --> print --> prints on same line


        //sc.next() --> by default it prints first word
        System.out.println("Enter a string");
        String Honeyy = sc.next();
        System.out.println(Honeyy);


        //sc.nextLine() --> it prints the complete line
       System.out.println("Heyyy Abhii");
        String Abhii = sc.nextLine();
        System.out.println(Abhii);
    }
}
