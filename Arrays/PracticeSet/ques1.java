package Arrays.PracticeSet;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //QUESTION1
        //--> Create an array of 5 floats and calculate their sum.

            System.out.println("Printing using for loop");
            float sum =0;
            float NUM[] = {11.08f,5.05f,2.12f,11.12f,9.2f};
            for(int i=0;i<=NUM.length-1;i++) {
                sum = sum + NUM[i];

            }
            System.out.println(sum);

        }

    }

