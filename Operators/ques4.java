package Operators;

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a JAVA program to convert km to miles.
        //1 mile = 0.621371 km

        System.out.println("Enter distance in km : ");
        float km = sc.nextFloat();

        double miles = km * 0.621371;
        System.out.println("Distance in miles is : " +miles);


    }
}
