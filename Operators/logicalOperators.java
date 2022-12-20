package Operators;
import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 5;

        //logical Operators --> && , || , !
        //	Logical operators are used to combine two boolean expression together and
        // results a single boolean value according to the operand and operator used.

        //Logical AND --> &&
        //Used to combine two expressions. If both operands are true or Non-Zero, returns true else false
        System.out.println(((a>=1) && (a<=10)) );  //-->((a>=1) && (a<=10)) returns true since (a>=1) is true
        // and also (a<=10) is true.



        //Logical OR --> ||
        //If any of the operand is true or Non-zero, returns true else false
        System.out.println(((a>1) || (a<5)));  //((a>1) || (a<5)) will return true. As (a>1) is true.
        // Since first operand is true hence there is no need to check for second operand.


        //Logical NOT --> !
        //Logical NOT operator is a unary operator. Returns the complement of the boolean value.
        System.out.println(!(a>1));  //!(a>1) will return false. Since (a>1) is true hence its complement is false.
        System.out.println(!(a>b));  //!(a>b) will return true. Since (a>b) is false hence its complement is true.
    }
}
