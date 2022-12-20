package Operators;
import java.util.Scanner;

public class assigmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Assignment Operators --> = , += , -= , *= , /= , %=
        //	Assignment operator is used to assign value to a variable.
        //Return type --> Boolean

        //x+=10; --> x = x + 10;

        int x = 10;
        System.out.println(x=2); //assigns the value

        System.out.println(x+=2); //Add and assign --> x = x + 2

        System.out.println(x-=2);  //Subtract and assign --> x = x - 2

        System.out.println(x*=2);  //Multiply and assign --> x = x * 2

        System.out.println(x/=2);  //Divide and assign --> x = x / 2


    }
}
