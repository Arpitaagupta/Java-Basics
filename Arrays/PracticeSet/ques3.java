package Arrays.PracticeSet;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {

        //QUESTION3
//Calculate the average marks from an array containing marks of all students in Physics using ForEach loop.
        Scanner sc = new Scanner(System.in);
        float marks[];
        float    sum=0;
        marks = new float[4];
        marks[0]=95f;
        marks[1]=92f;
        marks[2]=96f;
        marks[3]=98f;
        for(int i=0;i<=marks.length-1;i++)  {

            sum = ((sum + marks[i]));

        }
        System.out.println("AVERAGE MARKS IN PHYSICS IS " + sum/marks.length);

    }
}
