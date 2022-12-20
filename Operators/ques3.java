package Operators;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        //Write a program to calculate CGPA using marks of three subjects (out of 100).

        System.out.println("Enter marks of Physics : ");
        float p = sc.nextFloat();

        System.out.println("Enter marks of Chemistry : ");
        float c = sc.nextFloat();

        System.out.println("Enter marks of Mathematics : ");
        float m = sc.nextFloat();

        float cgpa = (p+m+c) / 30;
        System.out.println("CGPA of three subjects : " +cgpa);
    }
}
