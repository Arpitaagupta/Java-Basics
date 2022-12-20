package Operators;

import java.util.Scanner;

public class incrementAndDecrementOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 11;
        int b = 8;
        int c = 5;
        int d = 3;

        int e = a++;  //PreIncrement
        System.out.println(e);


        int f = b--; //PreDecrement
        System.out.println(f);


        int g = ++c;  //PostIncrement
        System.out.println(g);

        int h = --d;  //PostDecrement
        System.out.println(e);

    }
}
