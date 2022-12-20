package Operators;
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to sum three numbers in java.
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second number :");
        int num2 = sc.nextInt();

        System.out.println("Enter third number :");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3 ;
        System.out.println("Sum of three numbers is : " +sum );

    }
}
