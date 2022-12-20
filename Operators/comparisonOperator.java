package Operators;
import java.util.Scanner;

public class comparisonOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Comparison Operator or Relational operators
        // --> == , ! = , < , > , < = , > =
        //	Relational operators are used to check relation between any two operands.

        int a = 5;
        int b = 20;
        int x = 10;
        int y = 20;

        //==	equals to --> If both operands are equal returns true else false
        System.out.println(x==2);

        //! = not equals to --> If both operands are not equal returns true else false.
        System.out.println(x!=2);

        // < Less than --> If value of right operand is greater than left, returns true else returns false
        System.out.println(x < y);

        // > Greater than --> If value of left operand is greater than right, returns true else returns false
        System.out.println(x > y);

        // < = Less than or equals to --> If value of right operand is greater or equal to left operand,
        // returns true else false
        System.out.println(y <= x);
        System.out.println(b <= y);

        // > = Greater than or equals to --> If value of left operand is greater or equal to right operand,
        // returns true else false
        System.out.println(b >= a);
        System.out.println(b >= y);



    }

}
