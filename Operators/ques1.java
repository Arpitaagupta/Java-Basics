package Operators;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to calculate % of given student in CBSE board exam.
        // His marks from 5 subjects must be taken as input from keyboard.

        System.out.println("Enter marks of Physics : ");
        float p = sc.nextFloat();

        System.out.println("Enter marks of Chemistry : ");
        float c = sc.nextFloat();

        System.out.println("Enter marks of Mathematics : ");
        float m = sc.nextFloat();

        System.out.println("Enter marks of English : ");
        float e = sc.nextFloat();

        System.out.println("Enter marks of Informatics Practices : ");
        float ip = sc.nextFloat();

        float sum = p+c+m+e+ip;
        float per =((p+c+m+e+ip) /500) * 100 ;

        System.out.printf("Total marks obtained by student : %f out of 500 \n",sum);

        System.out.println("Percentage scored by student is : " +per);
    }

}
